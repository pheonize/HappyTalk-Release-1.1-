package oVANILLAz.happytalk.Database;

import oVANILLAz.happytalk.Child;
import oVANILLAz.happytalk.GroupHeader;
import oVANILLAz.happytalk.R;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class PlaceDAL {
    Child child;
    GroupHeader groupHeader;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void loadThaiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","ตัน-ดัช-เกอ-อา-ระห์-มา-นา","ห้องน้ำไปทางไหน","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","บี-ลิก-มัน-ดี-เกอ-อา-ระห์-มา-นา","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","เรส-โต-รัน-เกอ-อา-ระห์-มา-นา","ร้านอาหารไปทางไหน","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","เกอ-ได-เกอ-อา-ระห์-มา-นา","ร้านค้าไปทางไหน","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","เบง-เกล-เกอ-เร-ตา-เกอ-อา-ระห์-มา-นา","อู่ซ่อมรถไปทางไหน","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","โฮซ-ปิ-ตัล-เกอ-เร-ตา-เกอ-อา-ระห์-มา-นา","โรงพยาบาลไปทางไหน","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","กลี-นิก-เกอ-อา-ระห์-มา-นา","คลินิกไปทางไหน","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","เกอ-ได-อู-บัต-เกอ-อา-ระห์-มา-นา","ร้านขายยาไปทางไหน","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","ซเต-เซ็น-มี-ยัก-เกอ-อา-ระห์-มา-นา","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","โฮ-เตล-เกอ-อา-ระห์-มา-นา","โรงแรมไปทางไหน","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","ปา-ซัร-เกอ-อา-ระห์-มา-นา","ตลาดไปทางไหน","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","เติม-ปัต-เบิร-เฮิน-ตี-เกอ-เร-ตา-เกอ-อา-ระห์-มา-นา","จุดพักรถไปทางไหน","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","บา-ไล-โป-ลิช-เกอ-อา-ระห์-มา-นา","สถานีตำรวจไปทางไหน","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","โปน-โด๊ก-โป-ลิช-เกอ-อา-ระห์-มา-นา","ป้อมตำรวจไปทางไหน","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","เกอ-ได-เปอ-งู-รุป-เกอ-อา-ระห์-มา-นา","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","เปอ-ลา-บู-ฮัน-เกอ-อา-ระห์-มา-นา","ท่าเรือไปทางไหน","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","ซ-โตร์/ฆู-ดัง-บา-รัง-ดา-ฆา-งัน-เกอ-อา-ระห์-มา-นา","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------


    }

    public void loadThaiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar"," สี-โส่ว-เจียน-ไจ้-หน่าร","ห้องน้ำไปทางไหน","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","ยวี-ซื่อ-ไจ้-หน่าร","ห้องอาบน้ำไปทางไหน","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar"," ชัน-ทิง-ไจ้-หน่าร","ร้านอาหารไปทางไหน","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","ซัง-เตี้ยน-ไจ้-หน่าร","ร้านค้าไปทางไหน","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","ซิว-เชอ-หาง-ไจ้-หน่าร","อู่ซ่อมรถไปทางไหน","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","อี-เอวี้ยน-ไจ้-หน่าร","โรงพยาบาลไปทางไหน","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","เจิ๋น-สั่ว-ไจ้-หน่าร","คลินิกไปทางไหน","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","เย่า-เตี้ยน-ไจ้-หน่าร","ร้านขายยาไปทางไหน","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","เจีย-โหยว-จั้น-ไจ้-หน่าร","ปั๊มน้ำมันไปทางไหน","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar"," ฟั้น-เตี้ยน-ไจ้-หน่าร","โรงแรมไปทางไหน","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar"," ซื่อ-ฉ่าง-ไจ้-หน่าร","ตลาดไปทางไหน","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","ถิง-เชอ-ฉ่าง-ไจ้-หน่าร","จุดพักรถไปทางไหน","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","จิ่ง-ฉา-จวี๋-ไจ้-หน่าร","สถานีตำรวจไปทางไหน","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar"," จิ่ง-ฉา-กั่ง-ทิง-ไจ้-หน่าร","ป้อมตำรวจไปทางไหน","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar"," ฮว่อ-ปี้-ตุ้ย-ห้วน-ชู่-ไจ้-หน่าร","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar"," หม่า-โถว-ไจ้-หน่าร","ท่าเรือไปทางไหน","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar"," ชาง-คู่-ไจ้-หน่าร","โกดังพักสินค้าไปทางไหน","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------


    }

    public void loadThaiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","ห้องน้ำไปทางไหน","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","ร้านอาหารไปทางไหน","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","ร้านค้าไปทางไหน","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","อู่ซ่อมรถไปทางไหน","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","โรงพยาบาลไปทางไหน","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","คลินิกไปทางไหน","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","ร้านขายยาไปทางไหน","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","โรงแรมไปทางไหน","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","ตลาดไปทางไหน","Where is the market?","",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","จุดพักรถไปทางไหน","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","สถานีตำรวจไปทางไหน","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","ป้อมตำรวจไปทางไหน","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","ท่าเรือไปทางไหน","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------



    }

    public void loadThaiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","บ็อน–ตุ๊บ–ตึ๊ก–ตึว–คาง–หนา","ห้องน้ำไปทางไหน","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","บ็อน–ตุ๊บ–งู้ด–ตึ๊ก–ตึว–คาง–หนา","ห้องอาบน้ำไปทางไหน","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","ฮาง–บาย–ตึว–คาง–หนา","ร้านอาหารไปทางไหน","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","ฮาง–บาย–ตึว–คาง–หนา","ร้านค้าไปทางไหน","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","เยียน–ทาน–จั๊วะฮ–จุล–ลาน–ตึว–คาง–หนา","อู่ซ่อมรถไปทางไหน","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","ม็วน–ตี–แป๊ด–ตึว–คาง–หนา","โรงพยาบาลไปทางไหน","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","คลี–นิก–ตึว–คาง–หนา","คลินิกไปทางไหน","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","ฟา–มา–ซี–ตึว–คาง–หนา","ร้านขายยาไปทางไหน","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","ซทา–นี–เปรง–อิน–ตะ–เนียะ–ตึว–คาง–หนา","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","ซ็อน–ทา–เกีย–ตึว–คาง–หนา","โรงแรมไปทางไหน","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","พซา–ตึว–คาง–หนา","ตลาดไปทางไหน","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","ก็อน–แลง–ชุบ–ลาน–ตึว–คาง–หนา","จุดพักรถไปทางไหน","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","โป๊ะฮ–โป–ลีซ–ตึว–คาง–หนา","สถานีตำรวจไปทางไหน","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","ก็อน–แลง–โป๊ะฮ–เยียม–โป–ลีซ–ตึว–คาง– หนา","ป้อมตำรวจไปทางไหน","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","ก็อน–แลง–โดว–ลุย–บอ–เรอะ–เต๊ะฮ–ตึว–คาง– หนา","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","ก็อม–ปวง–แพ–ตึว–คาง–หนา","ท่าเรือไปทางไหน","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","เคลียง–ซ็อม–รับ–ดะ–เอ็ย–วัน–ตึว–คาง– หนา","โกดังพักสินค้าไปทางไหน","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadThaiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","ดีมานา กามัร เกอจีล (ตอยเลต)","ห้องน้ำไปทางไหน","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","ดีมานา กามัร มันดี","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","ดีมานา เรสโตรัน","ร้านอาหารไปทางไหน","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","ดีมานา โตโก","ร้านค้าไปทางไหน","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","ดีมานา เบงเกล","อู่ซ่อมรถไปทางไหน","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","ดีมานา รูมะฮ์ ซากิต","โรงพยาบาลไปทางไหน","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","ดีมานา กลีนิก","คลินิกไปทางไหน","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","ดีมานา อาโปเตก","ร้านขายยาไปทางไหน","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","ดีมานา โปมปา เบนซิน","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","ดีมานา โฮเตล","โรงแรมไปทางไหน","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","ดีมานา ปาซัร","ตลาดไปทางไหน","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","ดีมานา เตอมปัต ปากีร โมบิล","จุดพักรถไปทางไหน","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","ดีมานา กันโต โปลีซี","สถานีตำรวจไปทางไหน","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","ดีมานา โปส โปลีซี","ป้อมตำรวจไปทางไหน","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","ดีมานา เตอมปัต ตูกัร อูวัง","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","ดีมานา เดอรมากา","ท่าเรือไปทางไหน","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","ดีมานา กูดัง ซีมปัน บารัง","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadThaiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","ห้อง-น้ำ-ไป-ทาง-ใด","ห้องน้ำไปทางไหน","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","ห้อง-อาบ-น้ำ-ไป-ทาง-ใด","ห้องอาบน้ำไปทางไหน","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","ฮ้าน-อา-หาน-ไป-ทาง-ใด","ร้านอาหารไปทางไหน","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","ฮ้าน-ขาย-เคื่อง-ไป-ทาง-ใด","ร้านค้าไปทางไหน","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","กะ-ล่า-แปง-ลด-ไป-ทาง-ใด","อู่ซ่อมรถไปทางไหน","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","โฮง-หมอ-ไป-ทาง-ใด","โรงพยาบาลไปทางไหน","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","คลิ-นิก-ไป-ทาง-ใด","คลินิกไปทางไหน","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","ฮ้าน-ขาย-ยา-ไป-ทาง-ใด","ร้านขายยาไปทางไหน","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","ปั้ม-น้ำ-มัน-ไป-ทาง-ใด","ปั๊มน้ำมันไปทางไหน","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","โฮง-แฮม-ไป-ทาง-ใด","โรงแรมไปทางไหน","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","ตะ-หลาด-ไป-ทาง-ใด","ตลาดไปทางไหน","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","บ่อน-จอด-พัก-ลด-ไป-ทาง-ใด","จุดพักรถไปทางไหน","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","สะ-ถา-นี-ตำ-ลวด-ไป-ทาง-ใด","สถานีตำรวจไปทางไหน","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","ป้อม-ตำ-หลวด-ไป-ทาง-ใด","ป้อมตำรวจไปทางไหน","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","บ่อน-แลก-เปี่ยน-เงิน-ตา-ละ-หว่าง-ปะ-เทด-ไป-ทาง-ใด","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","ท่า-เฮือ-ไป-ทาง-ใด","ท่าเรือไปทางไหน","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","ห้อง-เมี้ยน-สิน-ค้า-ไป-ทาง-ใด","โกดังพักสินค้าไปทางไหน","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadThaiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","ตัน-ดัซ-เกอ-อา-ระห์-มา-นา","ห้องน้ำไปทางไหน","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","บี-ลิก-มัน-ดี-เกอ-อา-ระห์-มา-นา","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","เรส-โต-รัน-เกอ-อา-ระห์-มา-นา","ร้านอาหารไปทางไหน","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","เกอ-ได-เกอ-อา-ระห์-มา-นา","ร้านค้าไปทางไหน","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","เบง-เกล-เกอ-เร-ตา-เกอ-อา-ระห์-มา-นา","อู่ซ่อมรถไปทางไหน","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","โฮซ-ปี-ตัล-เกอ-อา-ระห์-มา-นา","โรงพยาบาลไปทางไหน","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","กลี-นิก-เกอ-อา-ระห์-มา-นา","คลินิกไปทางไหน","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","เกอ-ได-อู-บัต-เกอ-อา-ระห์-มา-นา","ร้านขายยาไปทางไหน","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","ซเต-เซ็น-มี-ยัก-เกอ-อา-ระห์-มา-นา","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","โฮ-เตล-เกอ-อา-ระห์-มา-นา","โรงแรมไปทางไหน","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","ปา-ซัร-เกอ-อา-ระห์-มา-นา","ตลาดไปทางไหน","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","เติม-ปัต-เบิร-เฮิน-ตี-เกอ-เร-ตา-เกอ-อา-ระห์-มา-นา","จุดพักรถไปทางไหน","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","บา-ไล-โป-ลิซ-เกอ-อา-ระห์-มา-นา","สถานีตำรวจไปทางไหน","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","โปน-โด๊ก-โป-ลิซ-เกอ-อา-ระห์-มา-นา","ป้อมตำรวจไปทางไหน","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","เกอ-ได-เปอ-งู-รุป-เกอ-อา-ระห์-มา-นา","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","เปอ-ลา-บู-ฮัน-เกอ-อา-ระห์-มา-นา","ท่าเรือไปทางไหน","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","ซ-โตร์ / ฆู-ดัง-บา-รัง-ดา-ฆา-งัน-เกอ-อา-ระห์-มา-นา","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","เอ่ง-ต่า-แบ่-หม่า-ชิ-แล","ห้องน้ำไปทางไหน","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","เหย่-โช-กาน-แบ่-หม่า-ชิ-แล","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","ซา-เต้า-ส่าย-แบ่-หม่า-ชิ-แล","ร้านอาหารไปทางไหน","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","เซ-ส่าย-แบ่-หม่า-ชิ-แล","ร้านค้าไปทางไหน","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","กา-วะ-เชาะ-แบ่-หม่า-ชิ-แล","อู่ซ่อมรถไปทางไหน","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","เซ-โหย่ง-แบ่-หม่า-ชิ-แล","โรงพยาบาลไปทางไหน","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","เซ-กาน-แบ่-หม่า-ชิ-แล","คลินิกไปทางไหน","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","เซ-ส่าย-แบ่-หม่า-ชิ-แล","ร้านขายยาไปทางไหน","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","ดั๊ด-สี่-ส่าย-แบ่-หม่า-ชิ-แล","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","โฮ-แต-แบ่-หม่า-ชิ-แล","โรงแรมไปทางไหน","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","เซ-แบ่-หม่า-ชิ-แล","ตลาดไปทางไหน","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","กา-ยัด-แด๊ะ-เหน่-หย่า-แบ่-หม่า-ชิ-แล","จุดพักรถไปทางไหน","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","แย-สะ-คาน-แบ่-หม่า-ชิ-แล","สถานีตำรวจไปทางไหน","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","แย-กีง-แบ่-หม่า-ชิ-แล","ป้อมตำรวจไปทางไหน","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","หนะ-ไหน่-หงั่น-งเว่-แล-แด๊ะ-เหน่-หย่า- แบ่-หม่า-ชิ-แล","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","เซ-กา-บา-มา-ซิ-แล","ท่าเรือไปทางไหน","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","โก่ง-โหย่ง-แบ่-หม่า - ชิ -แล","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","นา-ซา-อัน-อัง-บัน-โย","ห้องน้ำไปทางไหน","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","นา-ซา-อัน-อัง-ปา-ลิ-กุ-อัน","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","นา-ซา-อัน-อัง-คา-ริน-เด-ริ-ยา","ร้านอาหารไปทางไหน","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","นา-ซา-อัน-อัง-มอล","ร้านค้าไปทางไหน","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","นา-ซา-อัน-อัง-กา-รา-เฮ","อู่ซ่อมรถไปทางไหน","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","นา-ซา-อัน-อัง-ออส-ปิ-ตัล","โรงพยาบาลไปทางไหน","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","นา-ซา-อัน-อัง-กลิ-นิค","คลินิกไปทางไหน","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","นา-ซา-อัน-อัง-โบ-ติ-กา","ร้านขายยาไปทางไหน","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","นา-ซา-อัน-อัง-กา-โซ-ลิ-นา-ฮัน","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","นา-ซา-อัน-อัง-โฮ-เตล","โรงแรมไปทางไหน","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","นา-ซา-อัน-อัง-ปา-เลง-เก","ตลาดไปทางไหน","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","นา-ซา-อัน-อัง-ฮิน-ตุ-อัน-นัง-บุส","จุดพักรถไปทางไหน","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","นา-ซา-อัน-อัง-ฮิม-ปิ-ลัน-นัง-ปุ-ลิส","สถานีตำรวจไปทางไหน","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","นา-ซา-อัน-อัง-เชค-พอยท์-นัง-ปุ-ลิส","ป้อมตำรวจไปทางไหน","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","นา-ซา-อัน-อัง-ลุ-กา-ระ-ปัง-ปา-ลิท-นัง-เปรา","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","นา-ซา-อัน-อัง-ปู-เอ-เรอะ-โต","ท่าเรือไปทางไหน","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","นา-ซา-อัน-อัง-โบ-เด-กา","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","แวร์-อิส-เดอะ-ท้อย-เลท","ห้องน้ำไปทางไหน","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","แวร์-อิส-เดอะ-แบ๊ท-รูม","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","แวร์-อิส-เดอะ-เรส-เตอ-รอง","ร้านอาหารไปทางไหน","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","แวร์-อิส-เดอะ-ช้อป","ร้านค้าไปทางไหน","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","แวร์-อิส-เดอะ-กา-ร่าจ","อู่ซ่อมรถไปทางไหน","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","แวร์-อิส-เดอะ-ฮอส-ปี-ทอล","โรงพยาบาลไปทางไหน","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","แวร์-อิส-เดอะ-คลี-นิค","คลินิกไปทางไหน","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","แวร์-อิส-เดอะ-ฟา-มา-ซี","ร้านขายยาไปทางไหน","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","แวร์-อิส-เดอะ-แก๊ส-สเต๊-ชั่น","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","แวร์-อิส-เดอะ-โฮ-เทล","โรงแรมไปทางไหน","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","แวร์-อิส-เดอะ-ม้า-เก็ต","ตลาดไปทางไหน","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","แวร์-อิส-เดอะ-คาร์-เรส-แอ-เรีย","จุดพักรถไปทางไหน","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","แวร์-อิส-เดอะ-โพ-ลิส-สเต๊-ชั่น","สถานีตำรวจไปทางไหน","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","แวร์-อิส-เดอะ-โพ-ลิส-บู๊ท","ป้อมตำรวจไปทางไหน","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","แวร์-อิส-เดอะ-เอ็กซ์-เช้นจ์-บิ๊ว-โร","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","แวร์-อิส-เดอะ-เพียร์","ท่าเรือไปทางไหน","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","แวร์-อิส-เดอะ-แวร์เฮ้าส์","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","ฝ่อง-เหว่-ซิน-ดี-โหลย-หน่าว","ห้องน้ำไปทางไหน","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","ฝ่อง-ตั๊ม-ดี-โหลย-หน่าว","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","เตี่ยม-อัน-ดี-โหลย-หน่าว","ร้านอาหารไปทางไหน","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","เกื๋อ-เตี่ยม-ดี-โหลย-หน่าว","ร้านค้าไปทางไหน","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","กา-รา-เสือ-แซ-ดี-โหลย-หน่าว","อู่ซ่อมรถไปทางไหน","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","เบ่ง-เหวี่ยน-ดี-โหลย-หน่าว","โรงพยาบาลไปทางไหน","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","ฝ่อง-หมัก-ดี-โหลย-หน่าว","คลินิกไปทางไหน","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","เตี่ยม-ท๊วก-เตย-ดี-โหลย-หน่าว","ร้านขายยาไปทางไหน","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","ตร่าม-ซัง-ดี-โหลย-หน่าว","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","คั๊ก-ส่าน-ดี-โหลย-หน่าว","โรงแรมไปทางไหน","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","เจอะ-ดี-โหลย-หน่าว","ตลาดไปทางไหน","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","เนย-เดิ่ว-แซ-ดี-โหลย-หน่าว","จุดพักรถไปทางไหน","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","โดน-กง-อาน- ดี-โหลย-หน่าว","สถานีตำรวจไปทางไหน","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","ตร่าม-กั๋น-ซ๊าต-ดี-โหลย-หน่าว","ป้อมตำรวจไปทางไหน","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","ตร่าม-โด๋ย-หว่าย-เต๊-ดี-โหลย-หน่าว","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","เบน-เต่า-ดี-โหลย-หน่าว","ท่าเรือไปทางไหน","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","คอ-ตรื๋อ-ห่าง-ดี-โหลย-หน่าว","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("see-sow-jian-jai-nar","","Tandas ke arah  mana","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","Bilik mandi  ke arah mana","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","Restoran ke arah mana","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","Kedai ke arah mana","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","Bengkel kereta ke arah mana","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","Hospital ke arah mana","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","Klinik ke arah mana","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","Kedai ubat ke arah mana","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","Stesen minyak ke arah mana","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","Hotel ke arah mana","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","Pasar ke arah mana","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","Balai polis ke arah mana","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","Pondok polis ke arah mana","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","Pelabuhan ke arah mana","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------



    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("hongnam-pai-thang-nai","","Tandas ke arah  mana","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","Bilik mandi  ke arah mana","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","Restoran ke arah mana","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","Kedai ke arah mana","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","Bengkel kereta ke arah mana","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","Hospital ke arah mana","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","Klinik ke arah mana","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","Kedai ubat ke arah mana","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","Stesen minyak ke arah mana","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","Hotel ke arah mana","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","Pasar ke arah mana","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","Balai polis ke arah mana","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","Pondok polis ke arah mana","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","Kedai pengurup ke arah mana","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","Pelabuhan ke arah mana","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("bon-toop-tuek-tuew-khang-na","","Tandas ke arah  mana","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","Bilik mandi  ke arah mana","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","Restoran ke arah mana","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","Kedai ke arah mana","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","Bengkel kereta ke arah mana","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","Hospital ke arah mana","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","Klinik ke arah mana","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","Kedai ubat ke arah mana","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","Stesen minyak ke arah mana","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","Hotel ke arah mana","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","Pasar ke arah mana","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","Balai polis ke arah mana","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","Pondok polis ke arah mana","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","Pelabuhan ke arah mana","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Tandas ke arah  mana","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","Bilik mandi  ke arah mana","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Restoran ke arah mana","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Kedai ke arah mana","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Bengkel kereta ke arah mana","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Hospital ke arah mana","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Klinik ke arah mana","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Kedai ubat ke arah mana","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Stesen minyak ke arah mana","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Hotel ke arah mana","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Pasar ke arah mana","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Balai polis ke arah mana","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Pondok polis ke arah mana","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Pelabuhan ke arah mana","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hong-num-pai-tharng-dai","","Tandas ke arah  mana","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","Bilik mandi  ke arah mana","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","Restoran ke arah mana","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","Kedai ke arah mana","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","Bengkel kereta ke arah mana","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","Hospital ke arah mana","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","Klinik ke arah mana","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","Kedai ubat ke arah mana","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","Stesen minyak ke arah mana","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","Hotel ke arah mana","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","Pasar ke arah mana","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","Balai polis ke arah mana","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","Pondok polis ke arah mana","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","Pelabuhan ke arah mana","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("eng-ta-bae-ma-shi-lae","","Tandas ke arah  mana","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","Bilik mandi  ke arah mana","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","Restoran ke arah mana","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ke arah mana","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","Bengkel kereta ke arah mana","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","Hospital ke arah mana","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","Klinik ke arah mana","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ubat ke arah mana","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","Stesen minyak ke arah mana","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","Hotel ke arah mana","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","Pasar ke arah mana","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","Balai polis ke arah mana","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","Pondok polis ke arah mana","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","Kedai pengurup ke arah mana","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","Pelabuhan ke arah mana","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("nar-sar-an-ang-ban-yo","","Tandas ke arah  mana","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Bilik mandi  ke arah mana","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Restoran ke arah mana","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Kedai ke arah mana","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Bengkel kereta ke arah mana","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Hospital ke arah mana","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Klinik ke arah mana","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Kedai ubat ke arah mana","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Stesen minyak ke arah mana","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Hotel ke arah mana","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Pasar ke arah mana","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Balai polis ke arah mana","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Pondok polis ke arah mana","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Pelabuhan ke arah mana","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ware-is-der-toi-let","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("fong-way-sin-dee-loi-now","","Tandas ke arah  mana","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","Bilik mandi  ke arah mana","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","Restoran ke arah mana","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","Kedai ke arah mana","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","Bengkel kereta ke arah mana","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","Hospital ke arah mana","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","Klinik ke arah mana","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","Kedai ubat ke arah mana","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","Stesen minyak ke arah mana","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","Hotel ke arah mana","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","Pasar ke arah mana","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","Balai polis ke arah mana","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","Pondok polis ke arah mana","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","Kedai pengurup ke arah mana","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","Pelabuhan ke arah mana","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        Child child = new Child("see-sow-jian-jai-nar","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","ហាងបាយទៅខាងណា?","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","គ្លីនិកទៅខាងណា?","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","ផ្សារទៅខាងណា?","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hongnam-pai-thang-nai","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","ហាងបាយទៅខាងណា?","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","គ្លីនិកទៅខាងណា?","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","ផ្សារទៅខាងណា?","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","ហាងបាយទៅខាងណា?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","គ្លីនិកទៅខាងណា?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","ផ្សារទៅខាងណា?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("bon-toop-tuek-tuew-khang-na","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","ហាងបាយទៅខាងណា?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","គ្លីនិកទៅខាងណា?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","ផ្សារទៅខាងណា?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","ហាងបាយទៅខាងណា?","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","គ្លីនិកទៅខាងណា?","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","ផ្សារទៅខាងណា?","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hong-num-pai-tharng-dai","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","ហាងបាយទៅខាងណា?","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","គ្លីនិកទៅខាងណា?","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","ផ្សារទៅខាងណា?","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","ហាងបាយទៅខាងណា?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","គ្លីនិកទៅខាងណា?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","ផ្សារទៅខាងណា?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("eng-ta-bae-ma-shi-lae","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","ហាងបាយទៅខាងណា?","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","គ្លីនិកទៅខាងណា?","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","ផ្សារទៅខាងណា?","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("nar-sar-an-ang-ban-yo","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","ហាងបាយទៅខាងណា?","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","គ្លីនិកទៅខាងណា?","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","ផ្សារទៅខាងណា?","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ware-is-der-toi-let","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","ហាងបាយទៅខាងណា?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","គ្លីនិកទៅខាងណា?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","ផ្សារទៅខាងណា?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("fong-way-sin-dee-loi-now","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","ហាងបាយទៅខាងណា?","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","គ្លីនិកទៅខាងណា?","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","ផ្សារទៅខាងណា?","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("see-sow-jian-jai-nar",""," 洗手间在哪儿","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar",""," 浴室在哪儿","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar",""," 餐厅在哪儿","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar",""," 商店在哪儿","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar",""," 修车行在哪儿","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar",""," 医院在哪儿","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar",""," 诊所在哪儿","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar",""," 药店在哪儿","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar",""," 加油站在哪儿","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar",""," 饭店在哪儿","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar",""," 市场在哪儿","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar",""," 停车场在哪儿","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar",""," 警察局在哪儿","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","警察岗亭在哪儿","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar",""," 货币兑换处在哪儿","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar",""," 码头在哪儿","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar",""," 仓库在哪儿","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hongnam-pai-thang-nai",""," 洗手间在哪儿","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai",""," 浴室在哪儿","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai",""," 餐厅在哪儿","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai",""," 商店在哪儿","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai",""," 修车行在哪儿","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai",""," 医院在哪儿","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai",""," 诊所在哪儿","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai",""," 药店在哪儿","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai",""," 加油站在哪儿","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai",""," 饭店在哪儿","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai",""," 市场在哪儿","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai",""," 停车场在哪儿","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai",""," 警察局在哪儿","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","警察岗亭在哪儿","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai",""," 货币兑换处在哪儿","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai",""," 码头在哪儿","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai",""," 仓库在哪儿","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na",""," 洗手间在哪儿","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," 浴室在哪儿","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na",""," 餐厅在哪儿","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," 商店在哪儿","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na",""," 修车行在哪儿","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na",""," 医院在哪儿","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," 诊所在哪儿","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na",""," 药店在哪儿","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na",""," 加油站在哪儿","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na",""," 饭店在哪儿","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na",""," 市场在哪儿","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," 停车场在哪儿","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na",""," 警察局在哪儿","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","警察岗亭在哪儿","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na",""," 货币兑换处在哪儿","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," 码头在哪儿","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," 仓库在哪儿","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("bon-toop-tuek-tuew-khang-na",""," 洗手间在哪儿","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na",""," 浴室在哪儿","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na",""," 餐厅在哪儿","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na",""," 商店在哪儿","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na",""," 修车行在哪儿","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na",""," 医院在哪儿","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na",""," 诊所在哪儿","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na",""," 药店在哪儿","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na",""," 加油站在哪儿","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na",""," 饭店在哪儿","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na",""," 市场在哪儿","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na",""," 停车场在哪儿","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na",""," 警察局在哪儿","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","警察岗亭在哪儿","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na",""," 货币兑换处在哪儿","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na",""," 码头在哪儿","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na",""," 仓库在哪儿","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)",""," 洗手间在哪儿","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee",""," 浴室在哪儿","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran",""," 餐厅在哪儿","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go",""," 商店在哪儿","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel",""," 修车行在哪儿","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git",""," 医院在哪儿","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik",""," 诊所在哪儿","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek",""," 药店在哪儿","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin",""," 加油站在哪儿","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel",""," 饭店在哪儿","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar",""," 市场在哪儿","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil",""," 停车场在哪儿","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see",""," 警察局在哪儿","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","警察岗亭在哪儿","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang",""," 货币兑换处在哪儿","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar",""," 码头在哪儿","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang",""," 仓库在哪儿","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hong-num-pai-tharng-dai",""," 洗手间在哪儿","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai",""," 浴室在哪儿","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai",""," 餐厅在哪儿","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai",""," 商店在哪儿","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai",""," 修车行在哪儿","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai",""," 医院在哪儿","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai",""," 诊所在哪儿","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai",""," 药店在哪儿","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai",""," 加油站在哪儿","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai",""," 饭店在哪儿","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai",""," 市场在哪儿","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai",""," 停车场在哪儿","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai",""," 警察局在哪儿","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","警察岗亭在哪儿","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai",""," 货币兑换处在哪儿","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai",""," 码头在哪儿","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai",""," 仓库在哪儿","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na",""," 洗手间在哪儿","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," 浴室在哪儿","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na",""," 餐厅在哪儿","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," 商店在哪儿","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na",""," 修车行在哪儿","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na",""," 医院在哪儿","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," 诊所在哪儿","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na",""," 药店在哪儿","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na",""," 加油站在哪儿","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na",""," 饭店在哪儿","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na",""," 市场在哪儿","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," 停车场在哪儿","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na",""," 警察局在哪儿","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","警察岗亭在哪儿","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na",""," 货币兑换处在哪儿","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," 码头在哪儿","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," 仓库在哪儿","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("eng-ta-bae-ma-shi-lae",""," 洗手间在哪儿","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae",""," 浴室在哪儿","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae",""," 餐厅在哪儿","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae",""," 商店在哪儿","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae",""," 修车行在哪儿","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae",""," 医院在哪儿","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae",""," 诊所在哪儿","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae",""," 药店在哪儿","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae",""," 加油站在哪儿","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae",""," 饭店在哪儿","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae",""," 市场在哪儿","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae",""," 停车场在哪儿","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae",""," 警察局在哪儿","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","警察岗亭在哪儿","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae",""," 货币兑换处在哪儿","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae",""," 码头在哪儿","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae",""," 仓库在哪儿","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("nar-sar-an-ang-ban-yo",""," 洗手间在哪儿","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an",""," 浴室在哪儿","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar",""," 餐厅在哪儿","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl",""," 商店在哪儿","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey",""," 修车行在哪儿","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal",""," 医院在哪儿","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik",""," 诊所在哪儿","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar",""," 药店在哪儿","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han",""," 加油站在哪儿","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel",""," 饭店在哪儿","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey",""," 市场在哪儿","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos",""," 停车场在哪儿","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis",""," 警察局在哪儿","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","警察岗亭在哪儿","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar",""," 货币兑换处在哪儿","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to",""," 码头在哪儿","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar",""," 仓库在哪儿","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ware-is-der-toi-let",""," 洗手间在哪儿","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room",""," 浴室在哪儿","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong",""," 餐厅在哪儿","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop",""," 商店在哪儿","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch",""," 修车行在哪儿","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol",""," 医院在哪儿","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik",""," 诊所在哪儿","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see",""," 药店在哪儿","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan",""," 加油站在哪儿","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel",""," 饭店在哪儿","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket",""," 市场在哪儿","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria",""," 停车场在哪儿","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan",""," 警察局在哪儿","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","警察岗亭在哪儿","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro",""," 货币兑换处在哪儿","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia",""," 码头在哪儿","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus",""," 仓库在哪儿","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("fong-way-sin-dee-loi-now",""," 洗手间在哪儿","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now",""," 浴室在哪儿","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now",""," 餐厅在哪儿","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now",""," 商店在哪儿","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now",""," 修车行在哪儿","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now",""," 医院在哪儿","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now",""," 诊所在哪儿","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now",""," 药店在哪儿","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now",""," 加油站在哪儿","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now",""," 饭店在哪儿","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now",""," 市场在哪儿","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now",""," 停车场在哪儿","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now",""," 警察局在哪儿","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","警察岗亭在哪儿","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now",""," 货币兑换处在哪儿","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now",""," 码头在哪儿","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now",""," 仓库在哪儿","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        Child child = new Child("see-sow-jian-jai-nar","","Di mana kamar kecil (toilet) ?","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","Di mana kamar mandi ?","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","Di mana restoran ?","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","Di mana toko ?","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","Di mana bengkel ?","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","Di mana rumah sakit ?","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","Di mana klinik ?","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","Di mana apotek ?","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","Di mana pompa bensin?","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","Di mana hotel?","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","Di mana pasar ?","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","Di mana tempat parkir mobil ?","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","Di mana kantor polisi ?","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","Di mana pos polisi ?","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","Di mana tempat tukar uang?","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","Di mana dermaga ?","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","Di mana gudang simpan barang?","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hongnam-pai-thang-nai","","Di mana kamar kecil (toilet) ?","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","Di mana kamar mandi ?","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","Di mana restoran ?","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","Di mana toko ?","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","Di mana bengkel ?","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","Di mana rumah sakit ?","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","Di mana klinik ?","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","Di mana apotek ?","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","Di mana pompa bensin?","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","Di mana hotel?","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","Di mana pasar ?","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","Di mana tempat parkir mobil ?","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","Di mana kantor polisi ?","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","Di mana pos polisi ?","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","Di mana tempat tukar uang?","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","Di mana dermaga ?","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","Di mana gudang simpan barang?","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","Di mana kamar kecil (toilet) ?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Di mana kamar mandi ?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Di mana restoran ?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Di mana toko ?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Di mana bengkel ?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Di mana rumah sakit ?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Di mana klinik ?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Di mana apotek ?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Di mana pompa bensin?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Di mana hotel?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Di mana pasar ?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Di mana tempat parkir mobil ?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Di mana kantor polisi ?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Di mana pos polisi ?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Di mana tempat tukar uang?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Di mana dermaga ?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Di mana gudang simpan barang?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("bon-toop-tuek-tuew-khang-na","","Di mana kamar kecil (toilet) ?","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","Di mana kamar mandi ?","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","Di mana restoran ?","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","Di mana toko ?","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","Di mana bengkel ?","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","Di mana rumah sakit ?","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","Di mana klinik ?","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","Di mana apotek ?","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","Di mana pompa bensin?","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","Di mana hotel?","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","Di mana pasar ?","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","Di mana tempat parkir mobil ?","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","Di mana kantor polisi ?","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","Di mana pos polisi ?","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","Di mana tempat tukar uang?","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","Di mana dermaga ?","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","Di mana gudang simpan barang?","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Di mana kamar kecil (toilet) ?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","Di mana kamar mandi ?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Di mana restoran ?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Di mana toko ?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Di mana bengkel ?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Di mana rumah sakit ?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Di mana klinik ?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Di mana apotek ?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Di mana pompa bensin?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Di mana hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Di mana pasar ?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Di mana tempat parkir mobil ?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Di mana kantor polisi ?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Di mana pos polisi ?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Di mana tempat tukar uang?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Di mana dermaga ?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Di mana gudang simpan barang?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();

        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","Di mana kamar kecil (toilet) ?","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","Di mana kamar mandi ?","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","Di mana restoran ?","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","Di mana toko ?","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","Di mana bengkel ?","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","Di mana rumah sakit ?","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","Di mana klinik ?","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","Di mana apotek ?","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","Di mana pompa bensin?","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","Di mana hotel?","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","Di mana pasar ?","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","Di mana tempat parkir mobil ?","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","Di mana kantor polisi ?","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","Di mana pos polisi ?","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","Di mana tempat tukar uang?","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","Di mana dermaga ?","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","Di mana gudang simpan barang?","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadIndonesiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Di mana kamar kecil (toilet) ?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Di mana kamar mandi ?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Di mana restoran ?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Di mana toko ?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Di mana bengkel ?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Di mana rumah sakit ?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Di mana klinik ?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Di mana apotek ?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Di mana pompa bensin?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Di mana hotel?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Di mana pasar ?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Di mana tempat parkir mobil ?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Di mana kantor polisi ?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Di mana pos polisi ?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Di mana tempat tukar uang?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Di mana dermaga ?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Di mana gudang simpan barang?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadIndonesiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","Di mana kamar kecil (toilet) ?","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","Di mana kamar mandi ?","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","Di mana restoran ?","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Di mana toko ?","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","Di mana bengkel ?","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","Di mana rumah sakit ?","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","Di mana klinik ?","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Di mana apotek ?","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","Di mana pompa bensin?","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","Di mana hotel?","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","Di mana pasar ?","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","Di mana tempat parkir mobil ?","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","Di mana kantor polisi ?","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","Di mana pos polisi ?","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","Di mana tempat tukar uang?","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","Di mana dermaga ?","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","Di mana gudang simpan barang?","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","Di mana kamar kecil (toilet) ?","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Di mana kamar mandi ?","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Di mana restoran ?","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Di mana toko ?","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Di mana bengkel ?","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Di mana rumah sakit ?","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Di mana klinik ?","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Di mana apotek ?","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Di mana pompa bensin?","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Di mana hotel?","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Di mana pasar ?","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Di mana tempat parkir mobil ?","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Di mana kantor polisi ?","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Di mana pos polisi ?","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Di mana tempat tukar uang?","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Di mana dermaga ?","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Di mana gudang simpan barang?","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","Di mana kamar kecil (toilet) ?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","Di mana kamar mandi ?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","Di mana restoran ?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","Di mana toko ?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","Di mana bengkel ?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","Di mana rumah sakit ?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","Di mana klinik ?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","Di mana apotek ?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","Di mana pompa bensin?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","Di mana hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","Di mana pasar ?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","Di mana tempat parkir mobil ?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","Di mana kantor polisi ?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","Di mana pos polisi ?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","Di mana tempat tukar uang?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","Di mana dermaga ?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","Di mana gudang simpan barang?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","Di mana kamar kecil (toilet) ?","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","Di mana kamar mandi ?","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","Di mana restoran ?","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","Di mana toko ?","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","Di mana bengkel ?","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","Di mana rumah sakit ?","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","Di mana klinik ?","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","Di mana apotek ?","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana apotek ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","Di mana pompa bensin?","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","Di mana hotel?","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","Di mana pasar ?","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","Di mana tempat parkir mobil ?","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","Di mana kantor polisi ?","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","Di mana pos polisi ?","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","Di mana tempat tukar uang?","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","Di mana dermaga ?","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","Di mana gudang simpan barang?","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadLaosToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now",""," ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now",""," ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now",""," ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now",""," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now",""," ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now",""," ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now",""," ຄລິນິກໄປທາງໃດ","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now",""," ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now",""," ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now",""," ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now",""," ຕະຫຼາດໄປທາງໃດ","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now",""," ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now",""," ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now",""," ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now",""," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now",""," ທ່າເຮືອໄປທາງໃດ","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now",""," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar","","Tandas ke arah  mana","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","Bilik mandi  ke arah mana","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","Restoran ke arah mana","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","Kedai ke arah mana","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","Bengkel kereta ke arah mana","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","Hospital ke arah mana","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","Klinik ke arah mana","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","Kedai ubat ke arah mana","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","Stesen minyak ke arah mana","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","Hotel ke arah mana","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","Pasar ke arah mana","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","Balai polis ke arah mana","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","Pondok polis ke arah mana","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","Pelabuhan ke arah mana","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","Tandas ke arah  mana","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","Bilik mandi  ke arah mana","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","Restoran ke arah mana","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","Kedai ke arah mana","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","Bengkel kereta ke arah mana","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","Hospital ke arah mana","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","Klinik ke arah mana","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","Kedai ubat ke arah mana","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","Stesen minyak ke arah mana","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","Hotel ke arah mana","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","Pasar ke arah mana","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","Balai polis ke arah mana","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","Pondok polis ke arah mana","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","Kedai pengurup ke arah mana","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","Pelabuhan ke arah mana","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","","Tandas ke arah  mana","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","Bilik mandi  ke arah mana","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","Restoran ke arah mana","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","Kedai ke arah mana","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","Bengkel kereta ke arah mana","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","Hospital ke arah mana","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","Klinik ke arah mana","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","Kedai ubat ke arah mana","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","Stesen minyak ke arah mana","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","Hotel ke arah mana","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","Pasar ke arah mana","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","Balai polis ke arah mana","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","Pondok polis ke arah mana","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","Pelabuhan ke arah mana","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Tandas ke arah  mana","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","Bilik mandi  ke arah mana","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Restoran ke arah mana","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Kedai ke arah mana","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Bengkel kereta ke arah mana","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Hospital ke arah mana","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Klinik ke arah mana","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Kedai ubat ke arah mana","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Stesen minyak ke arah mana","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Hotel ke arah mana","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Pasar ke arah mana","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Balai polis ke arah mana","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Pondok polis ke arah mana","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Pelabuhan ke arah mana","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","Tandas ke arah  mana","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","Bilik mandi  ke arah mana","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","Restoran ke arah mana","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","Kedai ke arah mana","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","Bengkel kereta ke arah mana","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","Hospital ke arah mana","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","Klinik ke arah mana","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","Kedai ubat ke arah mana","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","Stesen minyak ke arah mana","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","Hotel ke arah mana","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","Pasar ke arah mana","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","Balai polis ke arah mana","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","Pondok polis ke arah mana","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","Pelabuhan ke arah mana","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadMalaysiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","Tandas ke arah  mana","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","Bilik mandi  ke arah mana","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","Restoran ke arah mana","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ke arah mana","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","Bengkel kereta ke arah mana","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","Hospital ke arah mana","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","Klinik ke arah mana","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ubat ke arah mana","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","Stesen minyak ke arah mana","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","Hotel ke arah mana","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","Pasar ke arah mana","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","Balai polis ke arah mana","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","Pondok polis ke arah mana","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","Kedai pengurup ke arah mana","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","Pelabuhan ke arah mana","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","Tandas ke arah  mana","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Bilik mandi  ke arah mana","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Restoran ke arah mana","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Kedai ke arah mana","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Bengkel kereta ke arah mana","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Hospital ke arah mana","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Klinik ke arah mana","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Kedai ubat ke arah mana","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Stesen minyak ke arah mana","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Hotel ke arah mana","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Pasar ke arah mana","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Balai polis ke arah mana","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Pondok polis ke arah mana","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Pelabuhan ke arah mana","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","Tandas ke arah  mana","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","Bilik mandi  ke arah mana","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","Restoran ke arah mana","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","Kedai ke arah mana","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","Bengkel kereta ke arah mana","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","Hospital ke arah mana","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","Klinik ke arah mana","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","Kedai ubat ke arah mana","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","Stesen minyak ke arah mana","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","Hotel ke arah mana","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","Pasar ke arah mana","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","Balai polis ke arah mana","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","Pondok polis ke arah mana","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","Kedai pengurup ke arah mana","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","Pelabuhan ke arah mana","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadMyanmarToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar","","Nasaan ang banyo?","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","Nasaan ang paliguan?","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","Nasaan ang carinderiya?","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","Nasaan ang mall?","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","Nasaan ang garahe?","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","Nasaan ang ospital?","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","Nasaan ang klinik?","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","Nasaan ang botika?","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","Nasaan ang gasolinahan?","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","Nasaan ang hotel?","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","Nasaan ang palengke?","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","Nasaan ang hintuan ng bus?","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","Nasaan ang himpilan ng pulis?","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","Nasaan ang puerto?","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","Nasaan ang bodega?","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","Nasaan ang banyo?","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","Nasaan ang paliguan?","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","Nasaan ang carinderiya?","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","Nasaan ang mall?","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","Nasaan ang garahe?","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","Nasaan ang ospital?","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","Nasaan ang klinik?","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","Nasaan ang botika?","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","Nasaan ang gasolinahan?","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","Nasaan ang hotel?","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","Nasaan ang palengke?","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","Nasaan ang hintuan ng bus?","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","Nasaan ang himpilan ng pulis?","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","Nasaan ang puerto?","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","Nasaan ang bodega?","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Nasaan ang banyo?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Nasaan ang paliguan?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Nasaan ang carinderiya?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Nasaan ang mall?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Nasaan ang garahe?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Nasaan ang ospital?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Nasaan ang klinik?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Nasaan ang botika?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Nasaan ang gasolinahan?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Nasaan ang hotel?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Nasaan ang palengke?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Nasaan ang hintuan ng bus?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Nasaan ang himpilan ng pulis?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Nasaan ang puerto?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Nasaan ang bodega?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","","Nasaan ang banyo?","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","Nasaan ang paliguan?","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","Nasaan ang carinderiya?","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","Nasaan ang mall?","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","Nasaan ang garahe?","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","Nasaan ang ospital?","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","Nasaan ang klinik?","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","Nasaan ang botika?","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","Nasaan ang gasolinahan?","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","Nasaan ang hotel?","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","Nasaan ang palengke?","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","Nasaan ang hintuan ng bus?","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","Nasaan ang himpilan ng pulis?","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","Nasaan ang puerto?","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","Nasaan ang bodega?","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();

        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Nasaan ang banyo?","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","Nasaan ang paliguan?","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Nasaan ang carinderiya?","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Nasaan ang mall?","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Nasaan ang garahe?","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Nasaan ang ospital?","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Nasaan ang klinik?","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Nasaan ang botika?","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Nasaan ang gasolinahan?","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Nasaan ang hotel?","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Nasaan ang palengke?","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Nasaan ang hintuan ng bus?","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Nasaan ang himpilan ng pulis?","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Nasaan ang puerto?","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Nasaan ang bodega?","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","Nasaan ang banyo?","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","Nasaan ang paliguan?","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","Nasaan ang carinderiya?","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","Nasaan ang mall?","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","Nasaan ang garahe?","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","Nasaan ang ospital?","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","Nasaan ang klinik?","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","Nasaan ang botika?","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","Nasaan ang gasolinahan?","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","Nasaan ang hotel?","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","Nasaan ang palengke?","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","Nasaan ang hintuan ng bus?","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","Nasaan ang himpilan ng pulis?","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","Nasaan ang checkpoint ng pulis?","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","Nasaan ang puerto?","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","Nasaan ang bodega?","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Nasaan ang banyo?","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Nasaan ang paliguan?","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Nasaan ang carinderiya?","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Nasaan ang mall?","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Nasaan ang garahe?","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Nasaan ang ospital?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Nasaan ang klinik?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Nasaan ang botika?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Nasaan ang gasolinahan?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Nasaan ang hotel?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Nasaan ang palengke?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Nasaan ang hintuan ng bus?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Nasaan ang himpilan ng pulis?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Nasaan ang puerto?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Nasaan ang bodega?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadPhilippinesToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","Nasaan ang banyo?","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","Nasaan ang paliguan?","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","Nasaan ang carinderiya?","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Nasaan ang mall?","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","Nasaan ang garahe?","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","Nasaan ang ospital?","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","Nasaan ang klinik?","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Nasaan ang botika?","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","Nasaan ang gasolinahan?","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","Nasaan ang hotel?","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","Nasaan ang palengke?","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","Nasaan ang hintuan ng bus?","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","Nasaan ang himpilan ng pulis?","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","Nasaan ang puerto?","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","Nasaan ang bodega?","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","Nasaan ang banyo?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Nasaan ang paliguan?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Nasaan ang carinderiya?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Nasaan ang mall?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Nasaan ang garahe?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Nasaan ang ospital?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Nasaan ang klinik?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Nasaan ang botika?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Nasaan ang gasolinahan?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Nasaan ang hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Nasaan ang palengke?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Nasaan ang hintuan ng bus?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Nasaan ang himpilan ng pulis?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Nasaan ang puerto?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Nasaan ang bodega?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","Nasaan ang banyo?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","Nasaan ang paliguan?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","Nasaan ang carinderiya?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","Nasaan ang mall?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","Nasaan ang garahe?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","Nasaan ang ospital?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","Nasaan ang klinik?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","Nasaan ang botika?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","Nasaan ang gasolinahan?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","Nasaan ang hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","Nasaan ang palengke?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","Nasaan ang hintuan ng bus?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","Nasaan ang himpilan ng pulis?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","Nasaan ang puerto?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","Nasaan ang bodega?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","Nasaan ang banyo?","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","Nasaan ang paliguan?","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","Nasaan ang carinderiya?","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","Nasaan ang mall?","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","Nasaan ang garahe?","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","Nasaan ang ospital?","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","Nasaan ang klinik?","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","Nasaan ang botika?","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","Nasaan ang gasolinahan?","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","Nasaan ang hotel?","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","Nasaan ang palengke?","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","Nasaan ang hintuan ng bus?","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","Nasaan ang himpilan ng pulis?","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","Nasaan ang puerto?","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","Nasaan ang bodega?","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar",""," 洗手间在哪儿","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 洗手间在哪儿", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar",""," 浴室在哪儿","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 浴室在哪儿", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar",""," 餐厅在哪儿","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 餐厅在哪儿", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar",""," 商店在哪儿","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 商店在哪儿", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar",""," 修车行在哪儿","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 修车行在哪儿", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar",""," 医院在哪儿","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 医院在哪儿", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar",""," 诊所在哪儿","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 诊所在哪儿", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar",""," 药店在哪儿","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 药店在哪儿", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar",""," 加油站在哪儿","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 加油站在哪儿", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar",""," 饭店在哪儿","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 饭店在哪儿", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar",""," 市场在哪儿","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 市场在哪儿", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar",""," 停车场在哪儿","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 停车场在哪儿", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar",""," 警察局在哪儿","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 警察局在哪儿", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","警察岗亭在哪儿","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("警察岗亭在哪儿", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar",""," 货币兑换处在哪儿","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 货币兑换处在哪儿", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar",""," 码头在哪儿","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头在哪儿", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar",""," 仓库在哪儿","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库在哪儿", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","ห้องน้ำไปทางไหน","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องน้ำไปทางไหน", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","ห้องอาบน้ำไปทางไหน","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("ห้องอาบน้ำไปทางไหน", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","ร้านอาหารไปทางไหน","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านอาหารไปทางไหน", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","ร้านค้าไปทางไหน","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านค้าไปทางไหน", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","อู่ซ่อมรถไปทางไหน","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("อู่ซ่อมรถไปทางไหน", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","โรงพยาบาลไปทางไหน","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("โรงพยาบาลไปทางไหน", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","คลินิกไปทางไหน","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("คลินิกไปทางไหน", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","ร้านขายยาไปทางไหน","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("ร้านขายยาไปทางไหน", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","ปั๊มน้ำมันไปทางไหน","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("ปั๊มน้ำมันไปทางไหน", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","โรงแรมไปทางไหน","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("โรงแรมไปทางไหน", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","ตลาดไปทางไหน","Where is the market?","",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("ตลาดไปทางไหน", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","จุดพักรถไปทางไหน","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("จุดพักรถไปทางไหน", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","สถานีตำรวจไปทางไหน","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("สถานีตำรวจไปทางไหน", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","ป้อมตำรวจไปทางไหน","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("ป้อมตำรวจไปทางไหน", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","สถานที่แลกเงินระหว่างประเทศไปทางไหน","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("สถานที่แลกเงินระหว่างประเทศไปทางไหน", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","ท่าเรือไปทางไหน","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("ท่าเรือไปทางไหน", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","โกดังพักสินค้าไปทางไหน","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("โกดังพักสินค้าไปทางไหน", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","","  បន្ទប់ទឹកទៅខាងណា?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("  បន្ទប់ទឹកទៅខាងណា?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na",""," បន្ទប់ងូតទឹកទៅខាងណា?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader(" បន្ទប់ងូតទឹកទៅខាងណា?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","ហាងបាយទៅខាងណា?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("ហាងបាយទៅខាងណា?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na",""," ហាងលក់ដូរទៅខាងណា?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ហាងលក់ដូរទៅខាងណា?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","មន្ទីរពេទ្យទៅខាងណា?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("មន្ទីរពេទ្យទៅខាងណា?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","គ្លីនិកទៅខាងណា?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("គ្លីនិកទៅខាងណា?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na",""," ហ្វាម៉ាស៊ីទៅខាងណា?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ហ្វាម៉ាស៊ីទៅខាងណា?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","សណ្ឋាគារទៅខាងណា?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("សណ្ឋាគារទៅខាងណា?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","ផ្សារទៅខាងណា?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("ផ្សារទៅខាងណា?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","កន្លែងឈប់ឡានទៅខាងណា?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងឈប់ឡានទៅខាងណា?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na",""," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","កន្លែងដូរលុយបរទេសទៅខាងណា?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("កន្លែងដូរលុយបរទេសទៅខាងណា?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","កំពង់ផែទៅខាងណា?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("កំពង់ផែទៅខាងណា?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na",""," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na",""," ជួយផង ខ្ញុំត្រូវចោរប្លន់","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវចោរប្លន់", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Di mana kamar kecil (toilet) ?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar kecil (toilet) ?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Di mana kamar mandi ?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kamar mandi ?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Di mana restoran ?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana restoran ?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Di mana toko ?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana toko ?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Di mana bengkel ?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana bengkel ?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Di mana rumah sakit ?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana rumah sakit ?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Di mana klinik ?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana klinik ?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Di mana pompa bensin?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pompa bensin?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Di mana hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Di mana pasar ?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pasar ?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Di mana tempat parkir mobil ?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat parkir mobil ?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Di mana kantor polisi ?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana kantor polisi ?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Di mana pos polisi ?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana pos polisi ?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Di mana tempat tukar uang?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana tempat tukar uang?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Di mana dermaga ?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana dermaga ?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Di mana gudang simpan barang?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("Di mana gudang simpan barang?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","ຫ້ອງນ້ຳໄປທາງໃດ","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຫ້ອງນ້ຳໄປທາງໃດ", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","ຫ້ອງອາບນ້ຳໄປທາງໃດ","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຫ້ອງອາບນ້ຳໄປທາງໃດ", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","ຮ້ານອາຫານໄປທາງໃດ","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຮ້ານອາຫານໄປທາງໃດ", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","ກະລ່າແປງລົດໄປທາງໃດ","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("ກະລ່າແປງລົດໄປທາງໃດ", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","ໂຮງໝໍໄປທາງໃດ","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("ໂຮງໝໍໄປທາງໃດ", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","ຄລິນິກໄປທາງໃດ","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຄລິນິກໄປທາງໃດ", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","ຮ້ານຂາຍຢາໄປທາງໃດ","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຮ້ານຂາຍຢາໄປທາງໃດ", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","ປ້ຳນ້ຳມັນໄປທາງໃດ","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("ປ້ຳນ້ຳມັນໄປທາງໃດ", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","ໂຮງແຮມໄປທາງໃດ","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("ໂຮງແຮມໄປທາງໃດ", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","ຕະຫຼາດໄປທາງໃດ","Where is the market?","",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຕະຫຼາດໄປທາງໃດ", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","ບ່ອນຈອດພັກລົດໄປທາງໃດ","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("ບ່ອນຈອດພັກລົດໄປທາງໃດ", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","ສະຖານີຕຳຫຼວດໄປທາງໃດ","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("ສະຖານີຕຳຫຼວດໄປທາງໃດ", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","ປ້ອມຕຳຫຼວດໄປທາງໃດ","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("ປ້ອມຕຳຫຼວດໄປທາງໃດ", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","ທ່າເຮືອໄປທາງໃດ","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("ທ່າເຮືອໄປທາງໃດ", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?","",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","Nasaan ang banyo?","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang banyo?", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Nasaan ang paliguan?","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang paliguan?", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Nasaan ang carinderiya?","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang carinderiya?", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Nasaan ang mall?","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang mall?", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Nasaan ang garahe?","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang garahe?", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Nasaan ang ospital?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang ospital?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Nasaan ang klinik?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang klinik?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Nasaan ang botika?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang botika?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Nasaan ang gasolinahan?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang gasolinahan?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Nasaan ang hotel?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hotel?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Nasaan ang palengke?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang palengke?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Nasaan ang hintuan ng bus?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang hintuan ng bus?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Nasaan ang himpilan ng pulis?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang himpilan ng pulis?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Nasaan ang checkpoint ng pulis?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang checkpoint ng pulis?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Nasaan ang lugar pang palit ng pera?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang lugar pang palit ng pera?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Nasaan ang puerto?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang puerto?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Nasaan ang bodega?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("Nasaan ang bodega?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","phòng vệ sinh đi lối nào","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","phòng tắm đi lối nào","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","tiệm ăn đi lối nào","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","cửa tiệm đi lối nào","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","ga ra sửa xe đi lối nào","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","bệnh viện đi lối nào?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","phòng mạch đi lối nào?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","trạm xăng đi lối nào?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","khách sạn đi lối nào?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","chợ đi lối nào?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","nơi đậu xe đi lối nào?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","đồn công an đi lối nào?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","trạm cảnh sát đi lối nào?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","bến tàu đi lối nào?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","kho trữ hàng đi lối nào?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("see-sow-jian-jai-nar","","phòng vệ sinh đi lối nào","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(R.raw.ch051_8);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","phòng tắm đi lối nào","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(R.raw.ch052_8);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","tiệm ăn đi lối nào","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(R.raw.ch053_8);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","cửa tiệm đi lối nào","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(R.raw.ch054_8);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","ga ra sửa xe đi lối nào","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(R.raw.ch055_8);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","bệnh viện đi lối nào?","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(R.raw.ch056_8);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","phòng mạch đi lối nào?","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(R.raw.ch057_8);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(R.raw.ch058_8);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","trạm xăng đi lối nào?","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(R.raw.ch059_8);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","khách sạn đi lối nào?","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(R.raw.ch060_8);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","chợ đi lối nào?","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(R.raw.ch061_8);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","nơi đậu xe đi lối nào?","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(R.raw.ch062_8);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","đồn công an đi lối nào?","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(R.raw.ch063_8);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","trạm cảnh sát đi lối nào?","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(R.raw.ch064_8);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(R.raw.ch065_8);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","bến tàu đi lối nào?","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(R.raw.ch066_8);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","kho trữ hàng đi lối nào?","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(R.raw.ch067_8);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hongnam-pai-thang-nai","","phòng vệ sinh đi lối nào","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th051_1);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","phòng tắm đi lối nào","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(R.raw.th052_1);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","tiệm ăn đi lối nào","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(R.raw.th053_1);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","cửa tiệm đi lối nào","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th054_1);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","ga ra sửa xe đi lối nào","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th055_1);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","bệnh viện đi lối nào?","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(R.raw.th056_1);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","phòng mạch đi lối nào?","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(R.raw.th057_1);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(R.raw.th058_1);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","trạm xăng đi lối nào?","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(R.raw.th059_1);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","khách sạn đi lối nào?","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(R.raw.th060_1);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","chợ đi lối nào?","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(R.raw.th061_1);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","nơi đậu xe đi lối nào?","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(R.raw.th062_1);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","đồn công an đi lối nào?","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th063_1);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","trạm cảnh sát đi lối nào?","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(R.raw.th064_1);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(R.raw.th065_1);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","bến tàu đi lối nào?","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(R.raw.th066_1);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","kho trữ hàng đi lối nào?","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(R.raw.th067_1);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","phòng vệ sinh đi lối nào","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.br051_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","phòng tắm đi lối nào","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.br052_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","tiệm ăn đi lối nào","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.br053_4);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","cửa tiệm đi lối nào","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.br054_4);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","ga ra sửa xe đi lối nào","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br055_4);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","bệnh viện đi lối nào?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.br056_4);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","phòng mạch đi lối nào?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.br057_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.br058_4);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","trạm xăng đi lối nào?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.br059_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","khách sạn đi lối nào?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.br060_4);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","chợ đi lối nào?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.br061_4);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","nơi đậu xe đi lối nào?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.br062_4);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","đồn công an đi lối nào?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br063_4);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","trạm cảnh sát đi lối nào?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.br064_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.br065_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","bến tàu đi lối nào?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.br066_4);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","kho trữ hàng đi lối nào?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.br067_4);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-tuek-tuew-khang-na","","phòng vệ sinh đi lối nào","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca051_2);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","phòng tắm đi lối nào","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca052_2);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","tiệm ăn đi lối nào","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca053_2);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","cửa tiệm đi lối nào","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca054_2);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","ga ra sửa xe đi lối nào","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca055_2);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","bệnh viện đi lối nào?","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca056_2);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","phòng mạch đi lối nào?","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca057_2);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca058_2);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","trạm xăng đi lối nào?","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca059_2);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","khách sạn đi lối nào?","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca060_2);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","chợ đi lối nào?","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca061_2);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","nơi đậu xe đi lối nào?","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca062_2);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","đồn công an đi lối nào?","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(R.raw.ca063_2);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","trạm cảnh sát đi lối nào?","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca064_2);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca065_2);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","bến tàu đi lối nào?","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(R.raw.ca066_2);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","kho trữ hàng đi lối nào?","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(R.raw.ca067_2);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","phòng vệ sinh đi lối nào","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(R.raw.indo051);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","phòng tắm đi lối nào","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.indo052);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","tiệm ăn đi lối nào","Where is the restaurant?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(R.raw.indo053);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","cửa tiệm đi lối nào","Where is the shop?","Di mana restoran ?",null,null);
        child.setSoundPath(R.raw.indo054);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","ga ra sửa xe đi lối nào","Where is the garage?","Di mana toko ?",null,null);
        child.setSoundPath(R.raw.indo055);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","bệnh viện đi lối nào?","Where is the hospital?","Di mana bengkel ?",null,null);
        child.setSoundPath(R.raw.indo056);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","phòng mạch đi lối nào?","Where is the clinic?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(R.raw.indo057);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","Di mana klinik ?",null,null);
        child.setSoundPath(R.raw.indo058);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","trạm xăng đi lối nào?","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(R.raw.indo059);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","khách sạn đi lối nào?","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(R.raw.indo060);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","chợ đi lối nào?","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(R.raw.indo061);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","nơi đậu xe đi lối nào?","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(R.raw.indo062);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","đồn công an đi lối nào?","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(R.raw.indo063);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","trạm cảnh sát đi lối nào?","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(R.raw.indo064);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(R.raw.indo065);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","bến tàu đi lối nào?","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(R.raw.indo066);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","kho trữ hàng đi lối nào?","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(R.raw.indo067);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadVietnamToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","phòng vệ sinh đi lối nào","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","phòng tắm đi lối nào","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","tiệm ăn đi lối nào","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","cửa tiệm đi lối nào","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","ga ra sửa xe đi lối nào","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","bệnh viện đi lối nào?","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","phòng mạch đi lối nào?","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","trạm xăng đi lối nào?","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","khách sạn đi lối nào?","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","chợ đi lối nào?","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","nơi đậu xe đi lối nào?","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","đồn công an đi lối nào?","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","trạm cảnh sát đi lối nào?","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","bến tàu đi lối nào?","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","kho trữ hàng đi lối nào?","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tun-das-ger-ar-rah-ma-na","","phòng vệ sinh đi lối nào","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(R.raw.ml051_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","phòng tắm đi lối nào","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(R.raw.ml052_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","tiệm ăn đi lối nào","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(R.raw.ml053_4);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","cửa tiệm đi lối nào","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(R.raw.ml054_4);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","ga ra sửa xe đi lối nào","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml055_4);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","bệnh viện đi lối nào?","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(R.raw.ml056_4);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","phòng mạch đi lối nào?","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(R.raw.ml057_4);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(R.raw.ml058_4);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","trạm xăng đi lối nào?","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(R.raw.ml059_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","khách sạn đi lối nào?","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(R.raw.ml060_4);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","chợ đi lối nào?","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(R.raw.ml061_4);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","nơi đậu xe đi lối nào?","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(R.raw.ml062_4);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","đồn công an đi lối nào?","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml063_4);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","trạm cảnh sát đi lối nào?","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(R.raw.ml064_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(R.raw.ml065_4);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","bến tàu đi lối nào?","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml066_4);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","kho trữ hàng đi lối nào?","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(R.raw.ml067_4);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("eng-ta-bae-ma-shi-lae","","phòng vệ sinh đi lối nào","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my051_5);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","phòng tắm đi lối nào","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my052_5);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","tiệm ăn đi lối nào","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my053_5);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","cửa tiệm đi lối nào","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my054_5);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","ga ra sửa xe đi lối nào","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my055_5);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","bệnh viện đi lối nào?","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my056_5);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","phòng mạch đi lối nào?","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my057_5);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my058_5);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","trạm xăng đi lối nào?","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my059_5);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","khách sạn đi lối nào?","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my060_5);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","chợ đi lối nào?","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my061_5);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","nơi đậu xe đi lối nào?","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my062_5);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","đồn công an đi lối nào?","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my063_5);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","trạm cảnh sát đi lối nào?","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my064_5);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my065_5);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","bến tàu đi lối nào?","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my066_5);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","kho trữ hàng đi lối nào?","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(R.raw.my067_5);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ban-yo","","phòng vệ sinh đi lối nào","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(R.raw.ph0051);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","phòng tắm đi lối nào","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(R.raw.ph0052);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","tiệm ăn đi lối nào","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(R.raw.ph0053);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","cửa tiệm đi lối nào","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(R.raw.ph0054);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","ga ra sửa xe đi lối nào","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(R.raw.ph0055);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","bệnh viện đi lối nào?","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(R.raw.ph0056);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","phòng mạch đi lối nào?","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(R.raw.ph0057);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(R.raw.ph0058);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","trạm xăng đi lối nào?","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(R.raw.ph0059);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","khách sạn đi lối nào?","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(R.raw.ph0060);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","chợ đi lối nào?","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(R.raw.ph0061);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","nơi đậu xe đi lối nào?","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(R.raw.ph0062);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","đồn công an đi lối nào?","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0063);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","trạm cảnh sát đi lối nào?","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(R.raw.ph0064);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(R.raw.ph0065);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","bến tàu đi lối nào?","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(R.raw.ph0066);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","kho trữ hàng đi lối nào?","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(R.raw.ph0067);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","phòng vệ sinh đi lối nào","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","phòng tắm đi lối nào","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","tiệm ăn đi lối nào","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","cửa tiệm đi lối nào","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","ga ra sửa xe đi lối nào","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","bệnh viện đi lối nào?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","phòng mạch đi lối nào?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","trạm xăng đi lối nào?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","khách sạn đi lối nào?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","chợ đi lối nào?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","nơi đậu xe đi lối nào?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","đồn công an đi lối nào?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","trạm cảnh sát đi lối nào?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","bến tàu đi lối nào?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","kho trữ hàng đi lối nào?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("fong-way-sin-dee-loi-now","","phòng vệ sinh đi lối nào","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.vt051_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng vệ sinh đi lối nào", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","phòng tắm đi lối nào","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.vt052_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng tắm đi lối nào", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","tiệm ăn đi lối nào","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.vt053_10);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm ăn đi lối nào", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","cửa tiệm đi lối nào","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.vt054_10);
        childList.add(child);

        groupHeader = new GroupHeader("cửa tiệm đi lối nào", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","ga ra sửa xe đi lối nào","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.vt055_10);
        childList.add(child);

        groupHeader = new GroupHeader("ga ra sửa xe đi lối nào", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","bệnh viện đi lối nào?","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.vt056_10);
        childList.add(child);

        groupHeader = new GroupHeader("bệnh viện đi lối nào?", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","phòng mạch đi lối nào?","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.vt057_10);
        childList.add(child);

        groupHeader = new GroupHeader("phòng mạch đi lối nào?", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","tiệm thuốc  tây đi lối nào?","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.vt058_10);
        childList.add(child);

        groupHeader = new GroupHeader("tiệm thuốc  tây đi lối nào?", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","trạm xăng đi lối nào?","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.vt059_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm xăng đi lối nào?", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","khách sạn đi lối nào?","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.vt060_10);
        childList.add(child);

        groupHeader = new GroupHeader("khách sạn đi lối nào?", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","chợ đi lối nào?","Where is the market?","",null,null);
        child.setSoundPath(R.raw.vt061_10);
        childList.add(child);

        groupHeader = new GroupHeader("chợ đi lối nào?", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","nơi đậu xe đi lối nào?","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.vt062_10);
        childList.add(child);

        groupHeader = new GroupHeader("nơi đậu xe đi lối nào?", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","đồn công an đi lối nào?","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.vt063_10);
        childList.add(child);

        groupHeader = new GroupHeader("đồn công an đi lối nào?", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","trạm cảnh sát đi lối nào?","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.vt064_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm cảnh sát đi lối nào?", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","trạm đổi ngoại tệ đi lối nào?","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.vt065_10);
        childList.add(child);

        groupHeader = new GroupHeader("trạm đổi ngoại tệ đi lối nào?", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","bến tàu đi lối nào?","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.vt066_10);
        childList.add(child);

        groupHeader = new GroupHeader("bến tàu đi lối nào?", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","kho trữ hàng đi lối nào?","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.vt067_10);
        childList.add(child);

        groupHeader = new GroupHeader("kho trữ hàng đi lối nào?", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }







    public ArrayList<GroupHeader> getGroupHeaderList()
    {
        return groupHeaderList;
    }

    public void loadMalaysiaToSingapore() {
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-toi-let","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(R.raw.eng051);
        childList.add(child);

        groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(R.raw.eng052);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(R.raw.eng053);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(R.raw.eng054);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(R.raw.eng055);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(R.raw.eng056);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(R.raw.eng057);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(R.raw.eng058);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(R.raw.eng059);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(R.raw.eng060);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(R.raw.eng061);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(R.raw.eng062);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(R.raw.eng063);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(R.raw.eng064);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(R.raw.eng065);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(R.raw.eng066);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(R.raw.eng067);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToLaos() {
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("hong-num-pai-tharng-dai","","အိမ္သာဘယ္မွာရွိလဲ။","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la051_3);
        childList.add(child);

        groupHeader = new GroupHeader("အိမ္သာဘယ္မွာရွိလဲ။", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la052_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la053_3);
        childList.add(child);

        groupHeader = new GroupHeader("စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la054_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဆိုင္ဘယ္မွာရွိလဲ။", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la055_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","ေဆးရွံဘယ္မွာရွိလဲ။","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la056_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးရွံဘယ္မွာရွိလဲ။", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","ေဆးခန္းဘယ္မွာရွိလဲ။","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la057_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးခန္းဘယ္မွာရွိလဲ။", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","ေဆးဆိုင္ဘယ္မွာရွိလဲ။","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la058_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေဆးဆိုင္ဘယ္မွာရွိလဲ။", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la059_3);
        childList.add(child);

        groupHeader = new GroupHeader("ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","ဟိုတယ္ဘယ္မွာရွိလဲ။","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la060_3);
        childList.add(child);

        groupHeader = new GroupHeader("ဟိုတယ္ဘယ္မွာရွိလဲ။", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","ေစ်းဘယ္မွာရွိလဲ။","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la061_3);
        childList.add(child);

        groupHeader = new GroupHeader("ေစ်းဘယ္မွာရွိလဲ။", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la062_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","ရဲစခန္းဘယ္မွာရွိလဲ။","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la063_3);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲစခန္းဘယ္မွာရွိလဲ။", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","ရဲကင္းဘယ္မွာရွိလဲ။","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la064_3);
        childList.add(child);

        groupHeader = new GroupHeader("ရဲကင္းဘယ္မွာရွိလဲ။", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la065_3);
        childList.add(child);

        groupHeader = new GroupHeader("ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la066_3);
        childList.add(child);

        groupHeader = new GroupHeader("ဆိပ္ကမ္းဘယ္မွာရွိလဲ။", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","ကုန္ရံုဘယ္မွာရွိလဲ။","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(R.raw.la067_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကုန္ရံုဘယ္မွာရွိလဲ။", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
}
