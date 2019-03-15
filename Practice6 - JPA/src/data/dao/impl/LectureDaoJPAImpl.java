package data.dao.impl;

import data.Lecture;
import data.dao.LecturesDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class LectureDaoJPAImpl implements LecturesDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    @Override
    public Lecture getLecture(int id) {
        return em.find(Lecture.class, id);
    }

    @Override
    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
