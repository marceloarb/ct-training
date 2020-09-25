import React from 'react';
import products from '../../../assets/product.json'
import Product from "./region/Product";


function ProductsView() {
    return (
        <div className='App'>
            <h1 id="title">
                Product name
            </h1>
            <div>
                {products.map((product) => {
                    return <Product key={product.id} name={product.name}/>;
                })}</div>
        </div>
    );
}

export default ProductsView;