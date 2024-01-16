package ru.sbrt.school;


import java.util.ArrayList;

public interface FriendsBD {

    /**
     * Метод выдает имеющийся список  User'ов по данному ID
     * @param UserID
     * @return возвращает список друзей
     */
    public ArrayList<UserImpl> getFriendsByID(int UserID);

    /**
     * Метод выдает пустой список  User'ов
     * @param UserID
     * @return возвращает пустой список друзей
     */
    public ArrayList<UserImpl> getFriendsByNewID(int UserID);

}
