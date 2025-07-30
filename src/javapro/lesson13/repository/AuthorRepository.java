package javapro.lesson13.repository;

import javapro.lesson13.entity.Author;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorRepository {
    private final Map<String, Author> authors = new HashMap<String, Author>();

    public void save(Author author) {
        authors.put(author.getId(), author);
    }

    public Author findByName(String name) {
        return authors.get(name);
    }

    public Author findById(String id) {
        return authors.get(id);
    }

    public boolean exists(String id) {
        return authors.containsKey(id);
    }

    public boolean existsByName(String authorName) {
        return authors.containsKey(authorName);
    }

    public List<Author> findAll() {
        return new ArrayList<>(authors.values());
    }

    public void deleteAuthorById(String id) {
        authors.remove(id);
    }
}
