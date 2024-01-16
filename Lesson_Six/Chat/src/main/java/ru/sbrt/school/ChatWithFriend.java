package ru.sbrt.school;

import java.util.Optional;

public interface ChatWithFriend {
    /**
     * Метод возвращает сообщение
     * @param UserID ID отправителя
     * @param FriendID ID получателя
     * @return optional сообщения
     */
    Optional<MessageCreator> getDialogWithFriend(int UserID, int FriendID);
}
