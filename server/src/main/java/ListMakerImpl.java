import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ListMakerImpl extends UnicastRemoteObject implements ListMaker {

    /**
     * constructor
     * @throws RemoteException
     */
    protected ListMakerImpl() throws RemoteException {
    }

    /* Creates a list then returns an id
     * Test to see if the list can be stored on the server.
     */
    @Override
    public int createList(String title) {
        /*
        List<String> quiz = new ArrayList<>();

        String q1 = "What is the meaning of life?";
        String q2 = "How old is the moon?";
        quiz.add(q1);
        quiz.add(q2);

        QuizContainer quizContainer = new QuizContainer();
        quizContainer.addQuiz(quiz, title);
        */
        return 24;
    }
}
