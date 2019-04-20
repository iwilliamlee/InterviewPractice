import common.Node;
import org.junit.Test;
import real_interview.HtmlSearch.HtmlSearch;

import java.util.List;

import static org.junit.Assert.*;

public class HtmlSearchTest {

    @Test
    public void searchDocument() {

        Node<String> he = new Node<String>("he");
        Node<String> llo = new Node<String>("llo");
        Node<String> wor = new Node<String>(" wor");
        Node<String> ld = new Node<String>("ld");

        Node<String> hello = new Node<String>("hello");
        Node<String> world = new Node<String>(" world");


        Node<String> leaves1 = new Node<>(new Node[]{hello, world});
        Node<String> leaves2 = new Node<>(new Node[]{he, llo, wor, ld, world});
        Node<String> leaves3 = new Node<>(new Node[]{he, llo});
        Node<String> leaves4 = new Node<>(new Node[]{wor, ld, world});

        Node<String> parent1 = new Node(new Node[]{leaves2});
        Node<String> parent2 = new Node(new Node[]{leaves1, parent1});

        Node<String> root = new Node(new Node[]{parent2, leaves3, leaves4});

        HtmlSearch htmlSearch = new HtmlSearch();
        List<Node<String>> nodes = htmlSearch.searchDocument(root, "l");

        for(Node<String> node : nodes) {
            System.out.print(node.value + ", ");
        }

    }
}