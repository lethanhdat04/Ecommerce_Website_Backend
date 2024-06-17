package repository;

import model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public Category findByName(String name);


    @Query("SELECT c FROM Category c WHERE c.name =: name AND c.parentCategory =: parentCategoryName")
    public Category findByNameAndParant(@Param("name") String name,
                                        @Param("parantCategoryName") String parentCategoryName);
}