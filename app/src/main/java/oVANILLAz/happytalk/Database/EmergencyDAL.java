package oVANILLAz.happytalk.Database;

import oVANILLAz.happytalk.Child;
import oVANILLAz.happytalk.GroupHeader;
import oVANILLAz.happytalk.R;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class EmergencyDAL {
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    Child child;
    GroupHeader groupHeader;
    public void loadThaiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","โต-ลง-ซา-ยา-เตอ-ละห์-ดี-ซา-มุน","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","โต-ลง-ซา-ยา-เตอ-ละห์-ดี-เจอ-เดอ-รา-กัน-โอ-รัง","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","ซา-ยา-โอ-รัง-ไทย-อา-ดา-โอ-รัง-ยัง-โบ-เละห์-เบิร-บา-ฮา-ซา-ไทย-กะห์","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","เกอ-เร-ตา-ซา-ยา-โร-ซัก-โบ-เละห์-กะห์-อัน-ดา-โต-ลง-ซา-ยา","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","ซา-ยา-เดอ-มัน","ฉันเป็นไข้","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","ซา-ยา-ซา-กิต-เกอ-ปา-ลา","ฉันปวดหัว","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","ซา-ยา-ซา-กิต-เปอ-รุต (ตี-ดัก-ซี-ฮัต)","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","ซา-ยา-ซา-กิต-เปอ-รุต (เฮิน-ดัก-เกอ-ตัน-ดัส)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","ซา-ยา-มา-ฮู-เมอ-เงอ-จ๊าจ-บา-เตอ-รี่","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","ซา-ยา-มา-ฮู-ปัง-ฆีล-อิน-ซู-รัน","ฉันต้องการเรียกประกัน","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","โต-ลง-ฮัน-ตัร-กัน-ซา-ยา-เกอ-โฮซ-ปี-ตัล","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","ซา-ยา-เมอ-งา-ลา-มี-เกอ-มา-ลา-งัน-โต-ลง-ละห์-ซา-ยา","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------


    }

    public void loadThaiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","จิ้ว-มิ่ง-อา หว่อ-เป้ย-เฉี่ยง-เจี๋ย-เลอ","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","จิ๋ว-มิ่ง-อา หว่อ-เป้ย-ซาง-ไห้-เลอ","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","หว่อ-ซื่อ-ไท้-กั๋ว-เหยิน สุย-ฮุ่ย-ซัว- ไท่- อวี่","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","เชอ-ฮว่าย-เลอ      หนี่-เหนิง-ปัง-หว่อ-มา","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","หว่อ-ฟา-เซา-เลอ","ฉันเป็นไข้","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng"," หว่อ-โถว-เถิง","ฉันปวดหัว","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","หว่อ-ตู้-จื่อ-เถิง (ปู้-ซู-ฝู )","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","หว่อ-ตู้-จื่อ-เถิง (สี-โส่ว-เจียน)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","หว่อ-เย่า-ชง-เตี้ยน","ฉันต้องการชาร์ตไฟ","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu"," หว่อ-เย่า-จ่าว-ป๋าว-เสี่ยน-กง-ซือ","ฉันต้องการเรียกประกัน","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","ฉิ่ง-ซ่ง-หว่อ-ชวี่-อี-เอวี้ยน","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor"," หว่อ-ชู-ซื่อ-กู้-เลอ ฉิ่ง-ปัง-หว่อ","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------


    }

    public void loadThaiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","ฉันเป็นไข้","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","ฉันปวดหัว","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","ฉันต้องการเรียกประกัน","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------



    }

    public void loadThaiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon","จวย – พอง – คญม – ตเริว – โจ – ปล็อน","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","จวย – พอง – คญม – ตเริว – เก – ทเวอ – บ๊าบ","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","คญม – เจีย – จวน – เจี้ยด – ทัย – เต๋อ – เมียน – เนียะ –นา – อาจ – นิ – เยียย – เพีย – ซา – ทัย – บาน – คละฮ – เต๋","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","ร็วด – ยวน – โคจ – เต๋อ – เนียะ – อาจ – จวย – คญม –บาน – เต๋","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","คญม – พดา – ซาย","ฉันเป็นไข้","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","คญม – ชือ – กบาล","ฉันปวดหัว","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","คญม – ชือ – ปั๊วะฮ  (โดจ – เจีย – มึน – ซรวล – ปัวะฮ –  เซาะฮ)","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","คญม – ชือ – ปั๊วะฮ  (โจล – บ็อน – ตุ๊บ – ตึ๊ก)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","คญม – ตเริว – กา – บ็อญ – โจล – เพลิง","ฉันต้องการชาร์ตไฟ","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","คญม – ตเริว – กา – เฮา – กรม – ฮุน – เทีย – เนีย  – รับ –โรง","ฉันต้องการเรียกประกัน","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","โซม – จวย – น็วม – คญม – ตึว – ม็วน – ตี – แป๊ด – บ็อน – เติจ","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","คญม –  บาน –  จ๊วบ – อุ – ปั๊ด – วะ – เฮด – โซม – จวย –  คญม –  พอง","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadThaiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","โตโลง, ซายา บารู ซาจา ดีรัมปก","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","โตโลง, ซายา บารู ซาจา ดีปูกูลี","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","ซายา โอรัง ไต. อาปา อาดา ยัง บีซา บีจารา บาฮาซา ไต","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","โมบิล ซายา รูซัก. อาปา อันดา บีซา บันตู ซายา","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","ซายา เมอนเดอรีตา เดอมัม","ฉันเป็นไข้","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","ซายา ซากิต เกอปาลา","ฉันปวดหัว","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","ซายา ซากิต เปอรูต","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","ซายา มูลัซ","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","ซายา อีงิน ชัรเจอร์ เตเลปน ซายา","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","ซายา อีงิน ปังกีล อาเกน อาซูรันซี","ฉันต้องการเรียกประกัน","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","โตโลง อันตัร ซายา เปอรกี เกอ รูมะฮ์ ซากิต","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","ซายา บารู ซาจา เมองาลามี เกอเจอลากาอัน ลาลู ลินตัซ, โตลง บันตู ซายา ","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }


    public void loadThaiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","ซ่อย-แด่-ข้อย-ถืก-ปุ้น","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","ซ่อย-แด่-ข้อย-ถืก-ทำ-ฮ้าย","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","ข้อย-เป็น-คน-ไท-มี-ใผ-เว้า-พา-สา-ไท-ได้แด่","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","ลด-เพ-เจ้า-ซ่อย-ได้-บอ","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","ข้อย-เป็น-ไข้","ฉันเป็นไข้","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","ข้อย-เจ็บ-หัว","ฉันปวดหัว","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","ข้อย-เจ็บ-ท้อง (บ่-สะ-บาย)","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","ข้อย-เจ็บ-ท้อง (ห้อง-น้ำ)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","ข้อย-ต้อง-กาน-สาก-ไฟ","ฉันต้องการชาร์ตไฟ","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","ข้อย-ต้อง-กาน-เอิ้น-ปะ-กัน","ฉันต้องการเรียกประกัน","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","ซ่อย-พา-ข้อย-ไป-โฮง-หมอ-แด่","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","ข้อย-ได้-ฮับ-อุ-บัด-ติ-เหด-ซ่อย-ข้อย-แด่","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadThaiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","โต-ลง-ซา-ยา-เตอ-ละห์-ดี-ซา-มุน","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","โต-ลง-ซา-ยา-เตอ-ละห์-ดี-เจอ-เดอ-รา-กัน-โอ-รัง","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","ซา-ยา-โอ-รัง-ไทย-อา-ดา-โอ-รัง-ยัง-โบ-เละห์-เบิร-บา-ฮา-ซา-ไทย-กะห์","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","กอ-เร-ตา-ซา-ยา-โร-ซัก-โบ-เละห์-กะห์-อัน-ดา-โต-ลง-ซา-ยา","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","ซา-ยา-เดอ-มัน","ฉันเป็นไข้","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","ซา-ยา-ซา-กิต-เกอ-ปา-ลา","ฉันปวดหัว","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","ซา-ยา-ซา-กิต-เปอ-รุต  (ตี-ดัก-ซี-ฮัต)","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","ซา-ยา-ซา-กิต-เปอ-รุต (เฮิน-ดัก-เกอ-ตัน-ดัซ)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","ซา-ยา-มา-ฮู-เมอ-เงอ-จ๊าจ-บา-เตอ-รี่","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","ซา-ยา-มา-ฮู-ปัง-ฆีล-อิน-ซู-รัน","ฉันต้องการเรียกประกัน","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","โต-ลง-ฮัน-ตัร-กัน-ซา-ยา-เกอ-โฮซ-ปี-ตัล","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","ซา-ยา-เมอ-งา-ลา-มี-เกอ-มา-ลา-งัน โต-ลง-ละห์-ซา-ยา","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","แก่-บ่า-โอง, จะ-หน่อ/จะ-มะ อะ-นุ-จัน-ซี- กั่น-ยะ-แด่","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","แก่-บ่า-โอง, จะ-หน่อ/จะ-มะ และ-เย่า มุ-จู-ลู่น-กั่น-ยะ- แด่","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","จะ-หน่อ/จะ- มะ ไท-หลู่-มโย-พิด-แด่, แบ่-ตู่-ไท-สะ-กา-ปยอ-ตั๊ด-ตะ-แล","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","กา-เปี๊ยะ-โละ ขะ-เมี้ย/ชี้น กู่-หญี่-เป-โละ-ยะ-ตะ-ลา","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","จะ-หน่อ/จะ-มะ เพีย-เหน่-แด่","ฉันเป็นไข้","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","จะ-หน่อ/จะ-มะ กาว-ไก้-แด่","ฉันปวดหัว","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","จะ-หน่อ/จะ-มะ ไป้-หน่า-แด่ (เหน่-มะ-กาว-บู)","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","จะ-หน่อ/จะ-มะ ไป้-หน่า-แด่ (เอ่ง-ต่า-ตวา- จี่น-แด่/อะ-เล-ตวา-จี่น-แด่)","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","จะ-หน่อ/จะ-มะ มี-อา-ตวีน-จี่น-แด่","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","จะ-หน่อ/จะ-มะ อา-มะ-กั่น-ข่อ-จี่น-แด่","ฉันต้องการเรียกประกัน","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","จะ-หน่อ/จะ-มะ โก่-เซ-โหย่ง-ไล่-โป๊ะ-เป-บ่า","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","จะ-หน่อ-มะ-ต่อ-ตะ-ซะ-พิด-โละ-กู่-หญี่-เป-บ่า","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","ตุ-ลุ-งัน-นิน-โย-อา-โก-นา-นา-กา-วัน-อา-โก","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","ตุ-ลุ-งัน-นิน-โย-อา-โก-นา-ซัก-ตัน-อา-โก","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","อา-โก-ไอ-ไทย-เม-รอน-บา-ดิ-ตอง-มา-รุ-นอง-มัก-ไทย","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","นา-ซิ-รา-อัน-อัง-กอท-เซ-โก-ปุ-เว-เด-นิ-โย-บา-อา-กอง-ตุ-ลุ-งัน    ","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","ไม-ซา-กิท-อา-โก","ฉันเป็นไข้","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","ไม-ซา-กิท-อุ-โล-อา-โก","ฉันปวดหัว","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","มา-ซา-กิท-อัง-ติ-ยัน-โก","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","มา-ซา-กิท-อัง-ติ-ยัน-โก-ไค-ลา-งัน-กอง-กา-มิ-ติน-อัง- บัน-โย","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","ไค-ลา-งัน-กอง-อิ-เร-ชาร์จ-อัง-บัท-ตา-ริ-ยา","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","ไค-ลา-งัน-กอง-ตา-วา-กัน-อัง-อา-เฮน-เต-โก-ซา-อิน-ชุ-รันซ","ฉันต้องการเรียกประกัน","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","ปา-กิ-ดา-ลา-นิน-โย-อา-โก-ซา-ออส-ปิ-ตัล","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","นา-อัก-ซิ-เอน-เต-อา-โก-ตุ-ลุ-งัน-นิ-โย-โป-อา-โก","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","เฮ้ลพ์-มี-ไอ-แฮฟ-บีน-ร็อบ","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","เฮ้ลพ์-มี-ไอ-แฮฟ-บีน-แอท-แทค","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","ไอ-แอม-ไท-ดาส-เอ๊น-นี่-วัน-สปีค-ไท","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","มาย-คาร์-แฮส-โบร้ค-เค่น-ดาวน์-แคน-ยู-เฮลพ์-มี","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","ไอ-แฮฟ-ก๊อท-อะ-เท้ม-เพอร์-เร-เจอร์","ฉันเป็นไข้","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","ไอ-แฮฟ-บีน-แฮฟ-วิ่ง-เฮ้ด-เอ้ค","ฉันปวดหัว","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","ไอ-แฮฟ-บีน-แฮฟ-วิ่ง-สโต-มัค-เอ้ค","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","ไอ-วู้ด-ไลค์-ทู-โก-ทู-เดอะ-ทอย-เลท","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","ไอ-นี้ด-ทู-ชาร์ต-อัพ-มาย-โฟน","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","ไอ-วู้ด-ไล้ค์-ทู-คอล-แอน-อิน-ชัว-รันซ์","ฉันต้องการเรียกประกัน","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","คู้ด-ยู-เทค-มี-ทู-เดอะ-ฮอส-ปี-ทอล","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","ไอ-แฮฟ-บีน-แฮฟ-วิ่ง-แอน-แอ๊ค-ซิ-เดนท์-คู้ด-ยู-เฮลพ์-มี","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadThaiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","กื๊ว-โตย, โตย-บิ-เกื๊อบ-เหยิต","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","กื๊ว-โตย, โตย-บิ-หั่น-ฮุง","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","โตย-หล่า-เหงื่อย-ไท้, ก๊อ-อาย-เบี๊ยต-น้อย-เตี้ยง-ไท้-คง?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","แซ-บิ-ฮ๋อง, บ่าน-ยุพ-โหะ-เดือก-คง?","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","โตย-บิ-ก๋าม","ฉันเป็นไข้","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","โตย-บิ-หยึ๊ก-เดิ่ว","ฉันปวดหัว","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","โตย-บิ-เดิ่ว-บุ่ง","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","โตย-ม้วน-ดี-เกิว","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","โตย-ม้วน-เกิว-เดี่ยน","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","โตย-ม้วน-ก่อย-บ๋าว-เฮี๋ยม","ฉันต้องการเรียกประกัน","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","หล่าม-เอิน-เดือ-โตย-ดี-เบ่ง-เหวี่ยน","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","โตย-บิ-ตาย-หนั่น, หล่าม-เอิน-ยุ๊พ-โตย-เว้ย","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","Tolong , saya telah disamun","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","Saya deman","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","Saya sakit kepala","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","Saya mahu mengecaj bateri ","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","Saya mahu panggil insuren","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","Saya deman","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","Saya sakit kepala","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","Saya mahu panggil insuren","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","Saya deman","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","Saya sakit kepala","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Saya mahu panggil insuren","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya deman","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya mahu panggil insuren","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","Saya deman","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","Saya sakit kepala","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","Saya mahu panggil insuren","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","Saya deman","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","Saya sakit kepala","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Saya mahu panggil insuren","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","Saya deman","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","Saya sakit kepala","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Saya mahu panggil insuren","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("help-mee-ai-haf-been-rob","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("kew-toay, toay-bi-kueap-yerd","","Tolong , saya telah disamun","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","Saya deman","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","Saya sakit kepala","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","Saya sakit perut (tidak sihat)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","Saya mahu mengecaj bateri ","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","Saya mahu panggil insuren","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","ខ្ញុំឈឺក្បាល","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","ខ្ញុំឈឺក្បាល","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","ខ្ញុំឈឺក្បាល","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","ខ្ញុំឈឺក្បាល","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","ខ្ញុំឈឺក្បាល","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","ខ្ញុំឈឺក្បាល","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("help-mee-ai-haf-been-rob",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","ខ្ញុំឈឺក្បាល","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kew-toay, toay-bi-kueap-yerd",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","ខ្ញុំឈឺក្បាល","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler",""," 救命啊，我被伤害了","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler",""," 我发烧了","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng",""," 我头疼","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)",""," 我肚子疼 （不舒服）","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian",""," 我要充电","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu",""," 我要找保险公司","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian",""," 请送我去医院","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai",""," 救命啊，我被伤害了","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai",""," 我发烧了","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua",""," 我头疼","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)",""," 我肚子疼 （不舒服）","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai",""," 我要充电","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan",""," 我要找保险公司","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee",""," 请送我去医院","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," 救命啊，我被伤害了","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," 我发烧了","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la",""," 我头疼","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," 我肚子疼 （不舒服）","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," 我要充电","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," 我要找保险公司","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal",""," 请送我去医院","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon",""," 救命啊，我被抢劫了","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb",""," 救命啊，我被伤害了","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay",""," 车坏了，你能帮我吗","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai",""," 我发烧了","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal",""," 我头疼","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)",""," 我肚子疼 （不舒服）","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)",""," 我肚子疼（洗手间）","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng",""," 我要充电","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang",""," 我要找保险公司","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert",""," 请送我去医院","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee",""," 救命啊，我被伤害了","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam",""," 我发烧了","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar",""," 我头疼","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root",""," 我肚子疼 （不舒服）","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las",""," 我肚子疼（洗手间）","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar",""," 我要充电","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see",""," 我要找保险公司","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git",""," 请送我去医院","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon",""," 救命啊，我被抢劫了","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai",""," 救命啊，我被伤害了","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor",""," 车坏了，你能帮我吗","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai",""," 我发烧了","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua",""," 我头疼","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)",""," 我肚子疼 （不舒服）","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)",""," 我肚子疼（洗手间）","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai",""," 我要充电","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun",""," 我要找保险公司","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae",""," 请送我去医院","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," 救命啊，我被伤害了","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," 我发烧了","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la",""," 我头疼","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," 我肚子疼 （不舒服）","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," 我要充电","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," 我要找保险公司","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal",""," 请送我去医院","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae",""," 救命啊，我被伤害了","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae",""," 我发烧了","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae",""," 我头疼","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)",""," 我肚子疼 （不舒服）","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae",""," 我要充电","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae",""," 我要找保险公司","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba",""," 请送我去医院","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go",""," 救命啊，我被伤害了","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go",""," 我发烧了","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go",""," 我头疼","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go",""," 我肚子疼 （不舒服）","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo",""," 我肚子疼（洗手间）","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar",""," 我要充电","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans",""," 我要找保险公司","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal",""," 请送我去医院","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("help-mee-ai-haf-been-rob",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak",""," 救命啊，我被伤害了","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer",""," 我发烧了","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks",""," 我头疼","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek",""," 我肚子疼 （不舒服）","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let",""," 我肚子疼（洗手间）","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon",""," 我要充电","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans",""," 我要找保险公司","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol",""," 请送我去医院","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kew-toay, toay-bi-kueap-yerd",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung",""," 救命啊，我被伤害了","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm",""," 我发烧了","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw",""," 我头疼","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung",""," 我肚子疼 （不舒服）","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu",""," 我肚子疼（洗手间）","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien",""," 我要充电","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem",""," 我要找保险公司","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien",""," 请送我去医院","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","Saya menderita demam","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","Saya sakit kepala","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","Saya sakit perut","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","Saya mulas","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","Saya ingin charger telepon saya","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","Saya ingin panggil agen asuransi","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","Saya menderita demam","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","Saya sakit kepala","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","Saya sakit perut","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","Saya mulas","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","Saya ingin charger telepon saya","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","Saya ingin panggil agen asuransi","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya menderita demam","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya mulas","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya ingin charger telepon saya","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya ingin panggil agen asuransi","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","Saya menderita demam","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","Saya sakit kepala","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Saya sakit perut","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Saya mulas","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","Saya ingin charger telepon saya","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Saya ingin panggil agen asuransi","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-ram-pok","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya menderita demam","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-mu-las","","Saya mulas","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya ingin charger telepon saya","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya ingin panggil agen asuransi","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","Saya menderita demam","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","Saya sakit kepala","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Saya sakit perut","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","Saya mulas","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","Saya ingin charger telepon saya","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","Saya ingin panggil agen asuransi","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadIndonesiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya menderita demam","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya mulas","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya ingin charger telepon saya","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya ingin panggil agen asuransi","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadIndonesiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","Saya menderita demam","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","Saya sakit kepala","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Saya sakit perut","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Saya mulas","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Saya ingin charger telepon saya","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Saya ingin panggil agen asuransi","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","Saya menderita demam","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","Saya sakit kepala","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Saya sakit perut","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Saya mulas","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Saya ingin charger telepon saya","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Saya ingin panggil agen asuransi","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","Saya menderita demam","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","Saya sakit perut","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","Saya mulas","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","Saya ingin charger telepon saya","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","Saya ingin panggil agen asuransi","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadIndonesiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","Tolong, Saya baru saja  dirampok.","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja  dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","Tolong, Saya baru saja dipukuli.","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dipukuli.", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","Saya menderita demam","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","Saya sakit kepala","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","Saya sakit perut","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","Saya mulas","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","Saya ingin charger telepon saya","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","Saya ingin panggil agen asuransi","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadLaosToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadLaosToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","Tolong , saya telah disamun","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","Saya deman","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","Saya sakit kepala","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","Saya mahu mengecaj bateri ","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","Saya mahu panggil insuren","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","Saya deman","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","Saya sakit kepala","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","Saya mahu panggil insuren","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","Saya deman","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","Saya sakit kepala","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Saya mahu panggil insuren","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya deman","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya mahu panggil insuren","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","Saya deman","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","Saya sakit kepala","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","Saya mahu panggil insuren","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadMalaysiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","Saya deman","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","Saya sakit kepala","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Saya mahu panggil insuren","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","Saya deman","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","Saya sakit kepala","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Saya mahu panggil insuren","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMalaysiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","Tolong , saya telah disamun","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","Saya deman","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","Saya sakit kepala","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","Saya sakit perut (tidak sihat)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","Saya mahu mengecaj bateri ","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","Saya mahu panggil insuren","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadMyanmarToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","May sakit ako.","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","May sakit ulo ako.","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","Masakit ang tiyan ko.","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","May sakit ako.","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","May sakit ulo ako.","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","Masakit ang tiyan ko.","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","May sakit ako.","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","May sakit ulo ako.","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Masakit ang tiyan ko.","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","May sakit ako.","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","May sakit ulo ako.","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Masakit ang tiyan ko.","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","May sakit ako.","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","May sakit ulo ako.","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Masakit ang tiyan ko.","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","May sakit ako.","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","May sakit ulo ako.","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Masakit ang tiyan ko.","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","May sakit ako.","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","May sakit ulo ako.","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Masakit ang tiyan ko.","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadPhilippinesToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","May sakit ako.","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","May sakit ulo ako.","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Masakit ang tiyan ko.","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","May sakit ako.","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","May sakit ulo ako.","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Masakit ang tiyan ko.","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","May sakit ako.","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","May sakit ulo ako.","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","Masakit ang tiyan ko.","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadPhilippinesToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","May sakit ako.","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","May sakit ulo ako.","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","Masakit ang tiyan ko.","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler",""," 救命啊，我被抢劫了","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被抢劫了", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler",""," 救命啊，我被伤害了","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 救命啊，我被伤害了", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee",""," 我是泰国人，谁会说泰语","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我是泰国人，谁会说泰语", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma",""," 车坏了，你能帮我吗","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 车坏了，你能帮我吗", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler",""," 我发烧了","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我发烧了", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng",""," 我头疼","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我头疼", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)",""," 我肚子疼 （不舒服）","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼 （不舒服）", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)",""," 我肚子疼（洗手间）","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我肚子疼（洗手间）", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian",""," 我要充电","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要充电", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu",""," 我要找保险公司","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我要找保险公司", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian",""," 请送我去医院","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 请送我去医院", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor",""," 我出事故了，请帮我","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader(" 我出事故了，请帮我", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","ช่วยด้วย ฉันโดนปล้น","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนปล้น", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","ช่วยด้วย ฉันโดนทำร้าย","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยด้วย ฉันโดนทำร้าย", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","รถเสีย คุณช่วยได้ไหม","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("รถเสีย คุณช่วยได้ไหม", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","ฉันเป็นไข้","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันเป็นไข้", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","ฉันปวดหัว","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดหัว", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","ฉันปวดท้อง(ไม่สบาย)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ไม่สบาย)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","ฉันปวดท้อง(ห้องน้ำ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันปวดท้อง(ห้องน้ำ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","ฉันต้องการชาร์ตไฟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการชาร์ตไฟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","ฉันต้องการเรียกประกัน","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("ฉันต้องการเรียกประกัน", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","ช่วยพาฉันไปโรงพยาบาลที","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("ช่วยพาฉันไปโรงพยาบาลที", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","ผมได้รับอุบัติเหตุ ช่วยผมด้วย","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("ผมได้รับอุบัติเหตุ ช่วยผมด้วย", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","ខ្ញុំឈឺក្បាល","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tolong, Saya baru saja dirampok.","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong, Saya baru saja dirampok.", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Saya orang Thai. ","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Apa ada yang bisa bicara bahasa Thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("Apa ada yang bisa bicara bahasa Thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Mobil saya rusak. Apa anda bisa bantu saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("Mobil saya rusak. Apa anda bisa bantu saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya menderita demam","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya menderita demam", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","Saya mulas","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mulas", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya ingin charger telepon saya","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin charger telepon saya", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya ingin panggil agen asuransi","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin panggil agen asuransi", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong antar saya pergi ke rumah sakit.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong antar saya pergi ke rumah sakit.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon",""," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai",""," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae",""," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor",""," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai",""," ຂ້ອຍເປັນໄຂ້","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເປັນໄຂ້", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua",""," ຂ້ອຍເຈັບຫົວ","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບຫົວ", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)",""," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)",""," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai",""," ຂ້ອຍຕ້ອງການສາກໄຟ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການສາກໄຟ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun",""," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae",""," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae",""," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader(" ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tulungan ninyo ako! Nanakawan ako! ","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nanakawan ako! ", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tulungan ninyo ako! Nasaktan ako!","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("Tulungan ninyo ako! Nasaktan ako!", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Ako ay Thai. Meron ba ditong marunong mag- thai?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("Ako ay Thai. Meron ba ditong marunong mag- thai?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","May sakit ako.","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ako.", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","May sakit ulo ako.","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("May sakit ulo ako.", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Masakit ang tiyan ko.","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko.", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Kailangan kong i re-charge ang batteriya.","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong i re-charge ang batteriya.", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Kailangan kong tawagan ang ahente ko sa insurance.","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("Kailangan kong tawagan ang ahente ko sa insurance.", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Paki dala ninyo ako sa ospital.","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("Paki dala ninyo ako sa ospital.", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Na-aksidente ako. Tulungan niyo po ako.","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("Na-aksidente ako. Tulungan niyo po ako.", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","","","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadSingaporeToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","tôi bị cảm","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","tôi bị nhức đầu","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","tôi bị đau bụng","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","tôi muốn đi cầu","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","tôi muốn câu điện","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(R.raw.ch068_8);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","cứu tôi, tôi bị hành hung","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(R.raw.ch069_8);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(R.raw.ch070_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(R.raw.ch071_8);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","tôi bị cảm","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(R.raw.ch072_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","tôi bị nhức đầu","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(R.raw.ch073_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","tôi bị đau bụng","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(R.raw.ch074_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","tôi muốn đi cầu","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(R.raw.ch075_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","tôi muốn câu điện","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(R.raw.ch076_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","tôi muốn gọi bảo hiểm","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(R.raw.ch077_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(R.raw.ch078_8);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(R.raw.ch079_8);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-plon","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(R.raw.th068_1);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(R.raw.th069_1);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(R.raw.th070_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(R.raw.th071_1);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","tôi bị cảm","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(R.raw.th072_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","tôi bị nhức đầu","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(R.raw.th073_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","tôi bị đau bụng","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(R.raw.th074_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","tôi muốn đi cầu","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(R.raw.th075_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","tôi muốn câu điện","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(R.raw.th076_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(R.raw.th077_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(R.raw.th078_1);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(R.raw.th079_1);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.br068_4);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.br069_4);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.br070_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.br071_4);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","tôi bị cảm","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.br072_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","tôi bị nhức đầu","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.br073_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","tôi bị đau bụng","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.br074_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","tôi muốn đi cầu","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.br075_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","tôi muốn câu điện","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.br076_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.br077_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.br078_4);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.br079_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("juay-phong-khyom-treuw-joe-plon","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(R.raw.ca068_2);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","cứu tôi, tôi bị hành hung","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(R.raw.ca069_2);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(R.raw.ca070_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca071_2);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","tôi bị cảm","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(R.raw.ca072_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","tôi bị nhức đầu","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(R.raw.ca073_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","tôi bị đau bụng","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(R.raw.ca074_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","tôi muốn đi cầu","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(R.raw.ca075_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","tôi muốn câu điện","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(R.raw.ca076_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","tôi muốn gọi bảo hiểm","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(R.raw.ca077_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(R.raw.ca078_2);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(R.raw.ca079_2);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","Tolong, Saya baru saja dirampok.",null,null);
        child.setSoundPath(R.raw.indo068);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","Saya orang Thai. ",null,null);
        child.setSoundPath(R.raw.indo069);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(R.raw.indo070);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(R.raw.indo071);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","tôi bị cảm","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(R.raw.indo072);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","tôi bị nhức đầu","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.indo073);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","tôi bị đau bụng","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(R.raw.indo074);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","tôi muốn đi cầu","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(R.raw.indo075);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","tôi muốn câu điện","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(R.raw.indo076);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(R.raw.indo077);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(R.raw.indo078);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(R.raw.indo079);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }


    public void loadVietnamToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","cứu tôi, tôi bị hành hung","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","tôi bị cảm","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","tôi bị nhức đầu","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","tôi bị đau bụng","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","tôi muốn đi cầu","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","tôi muốn câu điện","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","tôi muốn gọi bảo hiểm","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(R.raw.ml068_4);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(R.raw.ml069_4);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(R.raw.ml070_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(R.raw.ml071_4);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","tôi bị cảm","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(R.raw.ml072_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","tôi bị nhức đầu","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(R.raw.ml073_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","tôi bị đau bụng","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(R.raw.ml074_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","tôi muốn đi cầu","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(R.raw.ml075_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","tôi muốn câu điện","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(R.raw.ml076_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(R.raw.ml077_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(R.raw.ml078_4);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(R.raw.ml079_4);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my068_5);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(R.raw.my069_5);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(R.raw.my070_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(R.raw.my071_5);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","tôi bị cảm","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(R.raw.my072_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","tôi bị nhức đầu","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(R.raw.my073_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","tôi bị đau bụng","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(R.raw.my074_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","tôi muốn đi cầu","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(R.raw.my075_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","tôi muốn câu điện","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my076_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(R.raw.my077_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(R.raw.my078_5);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(R.raw.my079_5);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(R.raw.ph0068);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(R.raw.ph0069);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(R.raw.ph0070);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(R.raw.ph0071);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","tôi bị cảm","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(R.raw.ph0072);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","tôi bị nhức đầu","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(R.raw.ph0073);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","tôi bị đau bụng","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(R.raw.ph0074);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","tôi muốn đi cầu","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(R.raw.ph0075);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","tôi muốn câu điện","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(R.raw.ph0076);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(R.raw.ph0077);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(R.raw.ph0078);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(R.raw.ph0079);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-rob","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","tôi bị cảm","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","tôi bị nhức đầu","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","tôi bị đau bụng","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","tôi muốn đi cầu","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","tôi muốn câu điện","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadVietnamToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-kueap-yerd","","cứu tôi, tôi bị cướp giật","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.vt068_10);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị cướp giật", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","cứu tôi, tôi bị hành hung","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.vt069_10);
        childList.add(child);

        groupHeader = new GroupHeader("cứu tôi, tôi bị hành hung", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","tôi là người Thái, có ai biết nói tiếng Thái không?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.vt070_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi là người Thái, có ai biết nói tiếng Thái không?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","xe bị hỏng, bạn giúp hộ được không?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.vt071_10);
        childList.add(child);

        groupHeader = new GroupHeader("xe bị hỏng, bạn giúp hộ được không?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","tôi bị cảm","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.vt072_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị cảm", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","tôi bị nhức đầu","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.vt073_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị nhức đầu", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","tôi bị đau bụng","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.vt074_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị đau bụng", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","tôi muốn đi cầu","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.vt075_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn đi cầu", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","tôi muốn câu điện","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.vt076_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn câu điện", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","tôi muốn gọi bảo hiểm","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.vt077_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi muốn gọi bảo hiểm", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","làm ơn đưa tôi đi bệnh viện","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.vt078_10);
        childList.add(child);

        groupHeader = new GroupHeader("làm ơn đưa tôi đi bệnh viện", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","tôi bị tai nạn, làm ơn giúp tôi với","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.vt079_10);
        childList.add(child);

        groupHeader = new GroupHeader("tôi bị tai nạn, làm ơn giúp tôi với", "I’ve been having an accident, could you help me?", childList);
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
        child = new Child("help-mee-ai-haf-been-rob","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(R.raw.eng068);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(R.raw.eng069);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(R.raw.eng070);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(R.raw.eng071);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(R.raw.eng072);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(R.raw.eng073);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(R.raw.eng074);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(R.raw.eng075);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(R.raw.eng076);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(R.raw.eng077);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(R.raw.eng078);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(R.raw.eng079);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadMyanmarToLaos() {
        ArrayList<Child> childList = new ArrayList<Child>();
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-poon","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(R.raw.la068_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(R.raw.la069_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(R.raw.la070_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(R.raw.la071_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(R.raw.la072_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(R.raw.la073_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(R.raw.la074_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(R.raw.la075_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(R.raw.la076_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(R.raw.la077_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(R.raw.la078_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(R.raw.la079_3);
        childList.add(child);

        groupHeader = new GroupHeader("ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
}
