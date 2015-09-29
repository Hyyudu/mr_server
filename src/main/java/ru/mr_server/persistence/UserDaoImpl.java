package ru.mr_server.persistence;

import org.springframework.stereotype.Service;
import ru.mr_server.domain.Route;
import ru.mr_server.domain.RouteStep;
import ru.mr_server.domain.Step;
import ru.mr_server.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by HEDIN on 10.07.2014.
 */
@SuppressWarnings("unchecked")
@Service
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> listUsers() {
        return entityManager.createNamedQuery("findAllUsers", User.class)
                .getResultList();
    }

    @Override
    public void saveNewUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User authenticate(String login, String password) {
        List<User> resultList = entityManager.createNamedQuery("findUserByLoginPassword", User.class)
                .setParameter("login", login).setParameter("pass", password)
                .getResultList();
        if (resultList.isEmpty())
            return null;
        return resultList.get(0);
    }

    public void temp(Route route) {
        for (RouteStep routeStep : route.getSteps()) {
            Step persisted = entityManager.find(Step.class, routeStep.getStep().getId());
            if (persisted != null)
                routeStep.setStep(persisted);
        }
        entityManager.persist(route);
    }

}
