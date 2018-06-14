package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DepartmentScrollingActivity extends AppCompatActivity {
    static ArrayList<Department> departmentlist = new ArrayList<Department>();
    private DepartmentArrayAdapter departmentadapter;
    private ListView listView_introduct_department;
    private String test_str = "沿革與特色\n"+"本系成立於1969年，為我國資訊教育界先驅之一，從學士到博士班的優良師資及豐富的辦學經驗皆使本系在資訊教育界保持重要地位。然而本系精益求精的腳步卻從未停頓，近年來更不斷敦聘學界及業界精英於本系任教，擴大研究領域及提昇教學品質。本系並擁有專屬電腦機房，年年更新軟硬體設備和強化教學措施，務使學生有最精良完備之學習環境。\n"+"為使本系學生的學習能達到既廣且精的目標，本系在1999年率先提出『學程教學』之規劃，讓本系學生於資訊領域中，選擇符合其興趣與能力之學程加以研習，對學生資訊素養及專業能力的提昇，皆有極佳之助益。從2001年開始，本系所屬的資電學院全面實施『學程化教學』，除了基礎資電學理的奠定以外，特別注重專業實務能力的培養。各學程均有專題研究學分之要求，在指導老師的指導下，訓練學生以團隊的方式獨立完成自訂專題系統的實作或理論的推演。透過活潑化與重實務的學習方式，使學生對於專業領域有深度的認知與實作能力，對將來繼續升學或就業皆有相當大的幫助。\n"+"本系除一般授課教學外，更每年定期舉行專題競賽、硬體設計及程式設計比賽，由此加強學生之學習動機。並以榮譽及獎學金為鼓勵，加深學生之自我成長動力。\n"+"本系為中華工程教育學會(Institute of Engineering Education Taiwan，簡稱IEET)首批認證學系，並已於2005年1月、2007年8月及2010年12月皆通過大學部及碩博士班認證；IEET為教育部和國科會共同指定為我國推動「工程及科技教育認證」之專責國際聯繫窗口，本系通過該學會的認證，表示本系教育品質具備一定之標準，並達到與國際主流認證標準實質相當的地步，未來透過IEET與國際認證組織接軌的機制，將有助於本系與國際接軌、爭取外籍生或協助本系畢業生於國外發展。\n"+" \n"+" \n"+"專業的教學\n"+"本系課程的規劃係以奠定學生在資訊工程與計算機科學領域的基礎學養與專業能力為主要目標，同時參考美國電子電機工程學會(IEEE)與計算機協會(ACM)建議的課程，以及國內外各大學資訊工程領域的專業課程，並配合國內的實際情形訂定一套較具彈性的課程。除共同必修的通才教育科目外，本系為兼顧理論與實務並重，各領域均衡發展，特將課程規劃為三個學程：設有「電腦系統學程」、「軟體工程學程」、以及「網際網路工程學程」等三個學程，各領域均衡發展，茲分述如下：\n"+"電腦系統學程：\n"+"提供電腦系統的原理、程式開發、電路設計、軟硬體協同實作與嵌入式系統設計等課程，培養學生以電腦為主體的各種應用技術和專業能力。\n"+"軟體工程學程：\n"+"提供軟體發展技術、方法與理論課程，學習如何開發和維護高效能的軟體系統，並且提高軟體生產力與軟體品質，培養學生具備高級軟體工程師的資訊素養和專業能力。\n"+"網際網路工程學程：\n"+"以網路和資訊學理融入實務應用為主，提供網路與通訊相關技術，著重理論與新網路科技的平衡，並建立學生從事通訊網路系統應用、就業與研究之基礎。\n"+"以上每個學程均設有「專題研究」的課程，是本系訓練學生實務經驗的重要過程。本課程要求學生於大二下學期選定指導老師，自訂專題題目，經過三個學期的專題製作與撰寫專題報告，最後由三位教授的口試評審認可後始為通過，猶如正式的畢業論文。學生經此專題訓練後，不管是再繼續深造或就業，都能獲得各界的認同與重視。\n"+" \n"+" \n"+"豐富的資源\n"+"本系除院共同必修實驗室（電子電路實驗室、邏輯設計實驗室及微處理機實驗室）提供基礎教學實驗用外，另有三間學程專屬實驗室供本系各學程專業課程上課、實驗實習及專題研究之用。\n"+"電腦系統實驗室：\n"+"配置多樣的電腦系統教學設備與補充的資源，提供學生學習和實作電腦系統的軟、硬體整合以及資訊應用架構的設計。目的是讓學生在課程中所學的知識能有實際使用、體驗，並應用到未來資訊系統的機會。現有個人電腦、微處理機系統(8052模擬器)、數位系統(Altera UP1實驗板)、嵌入式系統開發套件(X-Hyper 255及EV44B0)、SoPC多媒體開發平台(Altera DE2-70)、RFID系統設計套件及機器人模組套件等教學實驗設備。\n"+"網際網路工程暨軟體工程實驗室：\n"+"提供學生網際網路工程相關課程學習及實作的環境，以網路和資訊學理融入實務應用為主，提供網路與通訊相關技術，著重理論與新網路科技的平衡，並建立學生從事通訊網路系統應用、就業與研究之基礎。另提供學生一個學習與實作軟體工程相關技術的實驗環境，各種教學題材及擴充資源都能在此獲得，專案開發團隊與老師也能在此持續的討論。現有個人電腦、教學硬體廣播系統、Cisco Router、Wireless AP、WSN無線感測器發展平台、無線遙控機器人、GPS手持式裝置開發平台、Cisco線上教材、Borland Together、WBEM軟體開發工具、軟體開發與管理整合工具、CMMI流程領域軟體及UML Case Tool 軟體開發系統等相關設備。\n"+"嵌入式系統實驗室：\n"+"隨著電子、資訊與通訊科技的愈趨成熟，晶片系統的設計與應用已成為電子產業的重要關鍵。本實驗室提供以晶片系統技術為主的電路設計、程式設計、軟硬體協同實作與嵌入式系統設計等課程，培養學生在晶片系統產業所需的專業能力。現有個人電腦、FPGA模擬板、ARM SOC嵌入式系統開發套件、SOC發展系統、TI DSP教學模組、創意型機器人、智慧型機器人、嵌入式教學平台、可程式化車載應用嵌入式系統等相關實驗套件。\n"+" \n"+"獎學金\n"+"除了學校及校外所提供的多項獎學金之外，本系為了鼓勵系上同學努力向學，特成立了「王德誠同學紀念獎學金」。為鼓勵本系同學認真求學，為人處事誠懇踏實，並具備表達溝通之能力，特成立「十速科技獎學金」。\n"+" \n"+"專精的研究\n"+"本系在研究方面，設有高速計算、RFID、低功率系統結構、平行與分散式處理、行動計算、網路管理、資訊安全、生物資訊、軟體工程、軟體工程(II)、計算機系統、VLSI、無線網路、綠能管理、多媒體暨網路安全及生物特徵辨識等16間實驗室，提供學生全方位資訊科技專業的研究環境。\n"+" \n"+"多元的活動\n"+"除了學業的要求以外，本系更透過導師制度和系學會之運作，輔以本校多項人文休閒活動，引導同學磨練與人相處之技巧、人際關係之溝通及自我表達之能力與自信。本系每學年均配合系學會與系友會，不定期邀請在國內外任職的傑出系友返系專題演講，提供學弟妹們未來就業與升學之參考，讓逢甲四年的學習之路更加順暢。\n"+" \n"+"未來展望\n"+"在教學方面，本系的優良師資及不斷精進之軟、硬體設備在各大專院校已是執牛耳之地位。目前系上授課及教學方向更是以學程導向為中心，對於學生之學習環境以及專業能力上，有顯著提昇。未來將以更完善的硬體設備及新進師資創造出優質之學習環境，且將對學程之實務教學及廠商配合做進一步之合作計劃，讓學生可以在更多的實作環境中進入資訊世界的廣大殿堂。\n"+"在研究與產業合作方面，今後除加強教學品質和積極爭取公民營機構之研究計畫，另一方面也將積極參與及舉辦各種專業和學術研討會，整合學校資源，帶動雙語教學計畫。未來，更將繼續延攬優良師資，增設專題實驗室，加強各重點領域，以帶動整合性大型研究計畫，提昇本系在資訊工程領域學術上及專業上的水準，為國家造就更多兼俱專業與人文素養之優秀科技人才。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_scrolling);

        //測試項目
        Department test = new Department("資工學系",R.drawable.ic_launcher_background,test_str);
        departmentlist.add(test);

        //listView建置
        departmentadapter = new DepartmentArrayAdapter(this,departmentlist);
        listView_introduct_department = (ListView)findViewById(R.id.listView_introduct_department);
        listView_introduct_department.setAdapter(departmentadapter);

        //listView點擊監聽和跳轉
        listView_introduct_department.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListView listView = (ListView) adapterView;
                Intent intent = new Intent();
                intent.setClass(DepartmentScrollingActivity.this,Department_detailScrollingActivity.class);
                intent.putExtra("now_num",i);
                startActivity(intent);
            }
        });
    }

    //相關圖片listView的adapter
    class DepartmentArrayAdapter extends ArrayAdapter<Department> {
        Context context;

        public DepartmentArrayAdapter(Context context,
                                      ArrayList<Department> items) {
            super(context, 0, items);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(context);
            LinearLayout itemlayout = null;

            if (convertView == null) {
                itemlayout = (LinearLayout) inflater.inflate(R.layout.content_department_scrolling, null);
            } else {
                itemlayout = (LinearLayout) convertView;
            }

            Department item = (Department) getItem(position);
            TextView tv_title = (TextView) itemlayout.findViewById(R.id.textView_dep_title);
            tv_title.setText(item.getTitle());
            ImageView iv = (ImageView) itemlayout.findViewById(R.id.imageView_dep_photo);
            iv.setImageResource(item.getImgid());
            return itemlayout;
        }
    }
}
