import { mount } from "enzyme";



export function renderComponent(component){
    return mount(component);
}
export function getElementById(component, value){
    return renderComponent(component).find(`[id="${value}"]`)
}
export function getElementByClassName(component, value){
    return renderComponent(component).find(`[className="${value}"]`)
}