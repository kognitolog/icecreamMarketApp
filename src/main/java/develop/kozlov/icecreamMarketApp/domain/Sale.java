package develop.kozlov.icecreamMarketApp.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "document")
    private List<SalePosition> list;

    public Sale(Long id, List<SalePosition> list) {
        this.id = id;
        this.list = list;
    }

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SalePosition> getList() {
        return list;
    }

    public void setList(List<SalePosition> list) {
        this.list = list;
    }
}
