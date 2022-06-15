public class Node {
    private String data;
    private Node link;

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Node getLink() { return link; }
    public String getData() { return data; }
    public void setLink(Node link) { this.link = link; }
    public void setData(String data) { this.data = data; }
}