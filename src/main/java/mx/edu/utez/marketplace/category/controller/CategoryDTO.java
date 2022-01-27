package mx.edu.utez.marketplace.category.controller;

public class CategoryDTO {
    private long id;
    private String description;


    public CategoryDTO() {
    }

    public CategoryDTO(String description) {
        this.description = description;
    }

    public CategoryDTO(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
