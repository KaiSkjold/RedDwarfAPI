package TEC.dk.RedDwarfAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reddwarf")
public class RedDwarfProductController {

    RedDwarfProductRepository repo;

    RedDwarfProductController(RedDwarfProductRepository repo){this.repo = repo;}

    @PostMapping
    void create(@RequestBody RedDwarfProduct product){
        repo.save(product);
    }

    @GetMapping
    public List<RedDwarfProduct> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    RedDwarfProduct GetById(@PathVariable int id){
        return repo.findById(id).get();
    }

    @PutMapping()
    void updateById(@RequestBody RedDwarfProduct product){
        repo.save(product);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id){
        repo.deleteById(id);
    }

}
