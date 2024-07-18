const express = require('express');
const router = express.Router();
const Product = require('../models/product');

// Render add product form
router.get('/addProduct', (req, res) => {
  res.render('addProduct');
});

// Insert a new product
router.post('/add', async (req, res) => {
  try {
    const product = new Product(req.body);
    await product.save();
    res.redirect('/');
  } catch (error) {
    res.status(400).send(error);
  }
});

// Delete a product
router.post('/delete/:productCode', async (req, res) => {
  try {
    await Product.deleteOne({ ProductCode: req.params.productCode });
    res.redirect('/');
  } catch (error) {
    res.status(400).send(error);
  }
});

// Get all products
router.get('/', async (req, res) => {
  try {
    const products = await Product.find().sort({ ProductStoreCode: -1 });
    res.render('index', { products });
  } catch (error) {
    res.status(400).send(error);
  }
});

module.exports = router;
