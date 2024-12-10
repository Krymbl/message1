package message1;

/*- Создать 4 пользователя (UserService - create4Users)
  - Создать 4 сообщения MessageService - create4Message(user1,user2)
  - Вывести сведения о пользователях
  - Вывести сведения о сообщениях
*/

public class App {
    public static void main(String[] args) {
        User[] arrUser = UserService.create4Users();
        String[] message = MessageUser.create4Message(arrUser[0],arrUser[1],arrUser[2],arrUser[3]);
        for (int i = 0; i < arrUser.length; i++) {
            System.out.println(arrUser[i].getNickName());
            System.out.println(arrUser[i].getName());
            System.out.println(arrUser[i].getPhoneNumber());
            System.out.println(arrUser[i].getPassword());
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
    }
}
