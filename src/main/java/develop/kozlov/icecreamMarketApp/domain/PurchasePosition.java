package develop.kozlov.icecreamMarketApp.domain;

import javax.persistence.*;

@Entity
public class PurchasePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stock_id")
    private Stock stock;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "document_id")
    private Purchase document;
    private int count;
    private double price;
    private double amount;

    public PurchasePosition() {
    }

    public PurchasePosition(Long id, Product product, Stock stock, int count, double price, double amount, Purchase document) {
        this.id = id;
        this.product = product;
        this.stock = stock;
        this.count = count;
        this.price = price;
        this.amount = amount;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Purchase getDocument() {
        return document;
    }

    public void setDocument(Purchase document) {
        this.document = document;
    }
}
