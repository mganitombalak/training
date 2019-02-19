export class BaseService<T> {
    create(entity: T): void {
        console.log("record created");
    }
    readAll(type: number): Array<any> {
        if (type === 1) {
            return [
                { code: "429901", description: "AÇIK HAVADA YAPILAN SPORLARA UYGUN TESİSLERİN VE EĞLENCE ALANLARI YAPILARININ İNŞAATI (GOLF SAHALARI, AÇIK STADYUMLAR, TENİS KORTLARI, ATLETİZM SAHALARI, PLAJ TESİSİ, DAĞ BARINAKLARI, EĞLENCE PARKLARI VB.)" },
                { code: "243301", description: "AÇIK PROFİLLERİN, NERVÜRLÜ LEVHALARIN VE SANDVİÇ PANELLERİN SOĞUK ŞEKİLLENDİRME VEYA KATLAMA YÖNTEMİYLE İMALATI" },
                { code: "439903", description: "AÇIK YÜZME HAVUZLARININ İNŞAATI" },
                { code: "259904", description: "ADİ METALDEN BÜRO MALZEMELERİ İMALATI (DOSYA KUTULARI, KAŞELER, ZIMBA TELLERİ, KÂĞIT ATAÇLARI VB.)" },
                { code: "259202", description: "ADİ METALDEN DİŞLİ KAPAKLAR (ŞİŞE KAPAĞI VB.) VE TIPALAR İLE TIKAÇLAR VE KAPAKLARIN İMALATI" },
              ];
        } else {
            return [
                { name: "1", address: "a1", title: "a1title" },
                { name: "2", address: "a2", title: "a2title" },
                { name: "3", address: "a3", title: "a3title" },
                { name: "4", address: "a4", title: "a4title" },
                { name: "5", address: "a5", title: "a5title" }
              ];
        }
    }

    readById(entityId: number): T {
        console.log("record returned.");
        return null;
    }

    update(entity: T): void {
        console.log("record updated.");
    }

    delete(entityId: number): void {
        console.log("record deleted.");
    }
}
