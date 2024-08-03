import java.util.ArrayList;
import java.util.List;

public class Post {
    private String username;      // Corrected from 'string' to 'String'
    private String postContent;   // Corrected from 'string' to 'String'
    private int likeCount;        // Corrected variable name to 'likeCount' for consistency
    private List<String> comments; // Changed 'comments' to List<String> for proper handling of comments

    // Constructor
    public Post(String username, String postContent, int likeCount) { // Fixed typo in parameter name and removed 'comments'
        this.username = username;
        this.postContent = postContent;
        this.likeCount = likeCount;
        this.comments = new ArrayList<>(); // Initialize comments list
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPostContent() { // Fixed method name to match attribute
        return postContent;
    }

    public void setPostContent(String postContent) { // Fixed method name to match attribute
        this.postContent = postContent;
    }

    public int getLikeCount() { // Fixed method name to match attribute
        return likeCount;
    }

    public void setLikeCount(int likeCount) { // Fixed method name to match attribute
        this.likeCount = likeCount;
    }

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    // Method to like the post
    public void likePost() {
        this.likeCount++;
    }

    // Method to display post details
    public void displayPost() {
        System.out.println("Username: " + username);
        System.out.println("Content: " + postContent); // Fixed attribute name
        System.out.println("Likes: " + likeCount); // Fixed attribute name
        System.out.println("Comments: " + comments); // Fixed attribute name
    }
}
