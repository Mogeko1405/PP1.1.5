package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("A", "a", (byte) 11);
        userDaoHibernate.saveUser("B", "b", (byte) 12);
        userDaoHibernate.saveUser("C", "c", (byte) 13);
        userDaoHibernate.saveUser("D", "d", (byte) 14);
        userDaoHibernate.removeUserById(1);
        userDaoHibernate.getAllUsers();
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}
