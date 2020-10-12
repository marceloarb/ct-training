import React, { useState as useStateMock } from "react";
import  {shallow,mount} from "enzyme";
import products from '../assets/product.json';
import ProductsView from "../component/view/products/ProductsView";

jest.mock('react', () => ({
  ...jest.requireActual('react'),
  useState: jest.fn(),
}));

const findByDataTestAttr = (wrapper,value) => wrapper.find(`[data-test='${value}']`)
test("verify product name label", () => {
    const expected = "Product name";
    const actual = findByDataTestAttr(shallow(<ProductsView/>),"title").text();
    expect(actual).toBe(expected);
})

test("verify product count", () => {
    const actual = findByDataTestAttr(mount(<ProductsView />),"product-name").length;
    console.log(actual);
    const expected = products.map((product) => { return product.name}).length;
    expect(actual).toBe(expected);
})

// test("verify product count is zero", () => {
//     const expected = 0;
//     const wrapper = findByDataTestAttr(mount(<ProductsView {...props} />),"product-name");
//     console.log(wrapper);
//     expect(actual).toBe(expected);
// })



