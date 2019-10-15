import { ICategory } from './ICategory';

export interface IProduct {
    id: number;
    name: string;
    category: ICategory;
    price: number;
}