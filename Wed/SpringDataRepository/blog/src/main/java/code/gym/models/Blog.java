package code.gym.models;

import javafx.scene.chart.PieChart;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private Date timeDate= new Date();
    private String description;
    private String main;
    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoryBlog categoryBlog;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(Date timeDate) {
        this.timeDate = timeDate;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public CategoryBlog getCategoryBlog() {
        return categoryBlog;
    }

    public void setCategoryBlog(CategoryBlog categoryBlog) {
        this.categoryBlog = categoryBlog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
