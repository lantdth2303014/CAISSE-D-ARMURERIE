using Microsoft.AspNetCore.Mvc;
using ProjectKy3.Models;

namespace ProjectKy3.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProductsController : ControllerBase
    {
        private static List<Product> products = new List<Product>
        {
            new Product { Id = 1, Name = "Running Shoes", Description = "Comfortable running shoes", Price = 99.99M, CategoryId = 1 },
            new Product { Id = 2, Name = "Sport T-shirt", Description = "Breathable sport t-shirt", Price = 29.99M, CategoryId = 2 }
        };

        private static List<Category> categories = new List<Category>
        {
            new Category { Id = 1, Name = "Shoes", Description = "All types of shoes" },
            new Category { Id = 2, Name = "Apparel", Description = "Clothing and accessories" }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Product>> GetProducts()
        {
            var productsWithCategories = products.Select(p =>
            {
                p.Category = categories.FirstOrDefault(c => c.Id == p.CategoryId);
                return p;
            });

            return Ok(productsWithCategories);
        }

        [HttpGet("{id}")]
        public ActionResult<Product> GetProduct(int id)
        {
            var product = products.FirstOrDefault(p => p.Id == id);
            if (product == null)
            {
                return NotFound();
            }

            product.Category = categories.FirstOrDefault(c => c.Id == product.CategoryId);

            return Ok(product);
        }

        [HttpPost]
        public ActionResult<Product> CreateProduct([FromBody] Product newProduct)
        {
            newProduct.Id = products.Count + 1;
            products.Add(newProduct);
            return CreatedAtAction(nameof(GetProduct), new { id = newProduct.Id }, newProduct);
        }
    }
}
