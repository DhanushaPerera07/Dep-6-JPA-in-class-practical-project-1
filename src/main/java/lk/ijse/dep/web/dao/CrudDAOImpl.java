/**
 * MIT License
 * <p>
 * Copyright (c) 2021 Dhanusha Perera
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/
package lk.ijse.dep.web.dao;

import lk.ijse.dep.web.entity.SuperEntity;
import lk.ijse.dep.web.util.JPAUtil;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class CrudDAOImpl<T extends SuperEntity, PK extends Serializable> implements CrudDAO<T, PK> {
    private final Class<T> entityClass;
    private EntityManager em;

    public CrudDAOImpl() {
        entityClass = ((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        this.em = JPAUtil.getEntityManagerFactory().createEntityManager();
    }

    /** This method will expose EntityManager to its subclasses */
    protected EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(SuperEntity entity) {
        this.em.persist(entity);
    }

    @Override
    public void update(PK key) {
        this.em.merge(this.em.find(entityClass, key));
    }

    @Override
    public void delete(PK key) {
        this.em.remove(this.em.find(entityClass, key));
    }

    @Override
    public T get(Serializable key) {
        return this.em.find(entityClass, key);
    }

    @Override
    public List getAll() {
        return this.em.createQuery("SELECT e " + entityClass + " e").getResultList();
    }


}
