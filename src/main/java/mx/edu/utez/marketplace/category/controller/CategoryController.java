package mx.edu.utez.marketplace.category.controller;

import mx.edu.utez.marketplace.category.model.Category;
import mx.edu.utez.marketplace.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = {"*"})
public class CategoryController {
    @Autowired
    CategoryService  categoryService;

    @GetMapping("/all")
    public ResponseEntity<Message> getAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getById(@PathVariable("id") long id){
        return categoryService.findById(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Message> createCategory(@RequestBody CategoryDTO categoryDTO){
        Category category = new Category(categoryDTO.getDescription());
        return categoryService.save(category);
    }

    @PutMapping("/update")
    public ResponseEntity<Message> updateCategory(@RequestBody CategoryDTO categoryDTO){
        Category category = new Category(categoryDTO.getId(),categoryDTO.getDescription());
        return categoryService.uptade(category);
    }
}
