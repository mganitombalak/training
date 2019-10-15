export interface ICategory {
    id: number;
    name: string;
    products: Array<ICategory>;
}