package com.example.demo.fragmant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.demo.R;
import com.example.demo.reviewcycel.Ultiman;
import com.example.demo.reviewcycel.UltimanAdapter;

import java.util.ArrayList;
import java.util.List;

public class BlankFragment extends Fragment {
     View view;
  RecyclerView recyclerView;

   ArrayList<Ultiman> mUltimanList;


    public BlankFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUltimanList=new ArrayList<>();
        Ultiman apple=new Ultiman("宇宙英雄奥特曼是圆谷特摄剧《初代奥特曼》中的主角。此名称为1993年中国引进《奥特曼》时为了" +
                "与其他奥特战士作区分而取。该角色的官方称呼为“奥特曼”，而并无宇宙英雄前缀，是奥特系列特摄剧第一个登场的奥特曼",R.drawable.kaisou1);
        mUltimanList.add(apple);
        Ultiman a=new Ultiman("是来自于M78星云的宇宙人，为追踪逃亡的宇宙怪兽百慕拉而来到地球，因伤害了地球人早田而感到内疚，因此奥特曼决心" +
                "与早田合二为一，共同为保卫地球的和平而战。在与杰顿战斗中败给杰顿，后来被佐菲奥特曼带回M78星云，现为宇宙警备队银河系局长",R.drawable.kaisou2);
        mUltimanList.add(a);
        Ultiman b=new Ultiman ("初代奥特曼的拳脚能力很强，且十分善于摔投术（在对抗 雷德王 、 泰莱斯通 、" +
                " 哥莫拉 等力量型对手时，均有不俗的表现），摔跤术在 " +
                "奥特兄弟 中最强。有着非常强大的格斗能力，并且防御力和抗" +
                "性是初代奥特曼中最强的，甚至有时防御不需要奥特屏障，胸前的肌肉可以抵挡十分强大的电击（阻挡过 美菲拉斯星人 和 内隆嘎 的",R.drawable.kaisou3);
        mUltimanList.add(b);
        Ultiman c =new Ultiman("电击）。 初代奥特曼 具有分身能力，招数有25%是切割技能，而且威力不凡，敢于直接抵抗怪兽的进攻，就连雷德王和哥莫拉也可抵挡，美菲拉斯星人也忌他三分。\n" +
                "特曼的变身是由早田使用β魔棒高高举起，按下红色的按钮后，β线（也被称为是闪光光束）会以螺旋形包围住早田（《奥特曼》第3、10话里有出现）随" +
                "后变身，变身·巨大化时的场景是“奥特曼右手握拳高举上方，左" +
                "手握拳放在头部附近”的这种独特的变身动作从红幕中由远及近，" +
                "这也是奥特曼登场的经典镜头，象征着奥特曼的巨大化过程，并且一" +
                "直横跨两个世纪，沿用至今。根据书籍设定，闪光光束是含有与M78星云人的生命之源，等",R.drawable.agru);
        mUltimanList.add(c);
        Ultiman d=new Ultiman("离子火花相同的能源，因为这种光可以在一定时间内变回原本的样子。\n" +
                "赛罗是光之国年轻的最强奥特战士，其基本作战能力来源于他的父亲赛文·奥特曼，自身的格斗能力和武器能力分别在雷欧的特训中培养而来，但最初的赛罗还缺乏足够实战经验。获得帕拉吉之盾的赛罗，实力大幅度提升，还能通过帕拉吉手镯从戴拿·奥特曼和高斯" +
                "·奥特曼中获得新力量，从而拥有变换形态的能力，" +
                "甚至可以集结同伴的光之力变成光辉赛罗。帕拉吉手镯" +
                "损坏后，可利用希卡利·奥特曼研发赠送的新世代奥特胶囊融" +
                "合升华成赛罗超限，这个姿态暂时代替究极赛罗。因此，赛罗是一个集多位奥特曼力量于一身的最强奥特战士，拥有华丽多彩的光线技能、勇敢坚定的战斗意志以及丰富娴熟的作战经验和格斗技巧，是个战斗水平超一流的战士。\n",R.drawable.gaiya1);
        mUltimanList.add(d);
        Ultiman e=new Ultiman(" 《迪迦·奥特曼》是圆谷英二开创的特摄系列作品《奥特曼》之一。迪迦·奥特曼是为了纪念\"奥特曼\"诞生30周年而拍的新作，也是“昭和系列”最后一篇" +
                "《爱迪奥特曼》首播16年后的第一部奥特曼系列片、“平成系" +
                "列奥特曼的第一弹。《迪迦·奥特曼》是奥特曼存在意义成人化的里程" +
                "碑。除了吸引当年收看过旧奥特曼系列的FANS们外，《迪迦·奥特曼》的" +
                "播映，无疑又为奥特曼系列增添了许多新的崇拜者。对于迪迦·奥特曼，圆谷公司进行了",R.drawable.gaiya2);
        mUltimanList.add(e);
        Ultiman f=new Ultiman("大胆的尝试。以前旧系列中，奥特曼战士都是来自外星球的战士，但是迪迦被设定为苏醒的超古代破坏神，这个设定为" +
                "以后奥特系列的发展也奠定了基础。在造型方面，迪迦·奥特曼拥有许多不同的形态，并" +
                "可以相互转化，逐步提高自己的能力，这在之前的系列中也是从来没有出现过的。在演员的选" +
                "用方面，圆谷也作出了大胆的尝试，启用流行乐团“V6”的歌手长野博出演迪迦·奥特曼的人间体大古队员，另外《奥特曼》中扮演初代奥特曼",R.drawable.men);
        mUltimanList.add(f);
        Ultiman g=new Ultiman("的人间体早田队员的扮演者黑部进的女儿吉本" +
                "多香美饰演柳濑丽娜，此外，和\"迪迦\"一起担" +
                "负保卫地球任务的。\"GUTS\"队员们，人人个性鲜明，个" +
                "个生动形象，这也是本作品的魅力之一。",R.drawable.men2);
        mUltimanList.add(g);
        Ultiman h=new Ultiman("本作世界观与昭和作不同，承接前作《迪迦·奥特曼》中的世界观和故事，继承已经完" +
                "型的迪迦的世界观的基础，设定在2017年的迈向宇宙开拓新领域时代。既然前作中已突破了现代地球上的种" +
                "种难关，那么作为续集的《戴拿·奥特曼》便是以太空为主题，DNA、深海、环境改造等等各方面都跟上改革的时代。\n" +
                "迪迦离开后的第8年，人类取得了巨大的突破，开始了对多种未知世界的开拓。地球人怀着单纯的憧憬以及无限的探求心，向太空进发，人们将此称为新领域的时代。\n",R.drawable.super1);
        mUltimanList.add(h);
        Ultiman j=new Ultiman("但与此同时，一些新的可怕力量也都苏醒过来。本作的主人" +
                "公·飞鸟信的父亲·飞鸟一马，是在光中消失的宇航飞行员。当时的飞鸟还和他的父亲约定回来看他打棒球，在此时他却从戴民长官那里得知了噩耗。\n" +
                "飞鸟长大后，加入了地球和平联合组织TPC，在一次模拟战争中一举击败了SUPE" +
                "R GUTS的王牌飞行员由美村良，然而此时他却遇到了宇宙球体“斯菲亚”" +
                "，虽然他奋力战斗，却寡不敌众。此时他看见了神秘的光，成为了",R.drawable.super2);
        mUltimanList.add(j);
        Ultiman i=new Ultiman("戴拿的人间体。当飞鸟清醒过来时，他已经莫" +
                "名其妙地成为了SUPER GUTS的队员了，是由美举荐了他。在火星的一次" +
                "战斗中，斯菲亚与岩石合体，变成了怪兽。飞鸟在和它的战斗时，身陷险境，" +
                "此时他的身体发出闪亮的光。这时，他变成了新的光之巨人，以的压倒性的实力击败" +
                "了敌人。当飞鸟恢复回原来的样子时，他的脚边出现了神秘的变身器·闪光剑。在之后" +
                "，SUPER GUTS的女队员绿川舞给这个新奥特曼命名为“戴拿·奥特曼”，于是，新的光之巨人传说开始了。\n" +
                "\n",R.drawable.daina1);
        mUltimanList.add(i);
        Ultiman k=new Ultiman("《泰罗·奥特曼》，是《奥特曼系列》的第六部作品，首播日期为1973年4月6日至1" +
                "974年4月5日。这部作品主要讲述了东京湾突然出现" +
                "了食油超兽多林卡，青年东光太郎挺身而出，孤身奋战将超兽赶走，他" +
                "的勇敢机智赢得了宇宙科学警备队ZAT的队长朝日奈勇太郎的赞赏，也赢得了化" +
                "身绿婆婆的奥特之母的认可。于是他被邀请加入",R.drawable.daina2);
        mUltimanList.add(k);
        Ultiman l=new Ultiman("了宇宙科学警备队ZAT，又被奥特之母赋予了能够变" +
                "身为泰罗的奥特徽章，在第一次与怪兽阿斯托罗姆斯的战斗中，献出了生命，" +
                "这时奥特五兄弟将东光太郎带入了另一个空间并与奥特之母一起把泰罗的生" +
                "命给予了东光太郎。我们的主角泰罗就因此诞生了，泰罗的近身格斗和远程射击的光线技能威力都十分强大，是奥特兄弟中最强的。\n" +
                "\n",R.drawable.tailuo1);
        mUltimanList.add(l);
        Ultiman m=new Ultiman("泰罗·奥特曼是作为第二期奥特系列的第三作，同时也是圆谷株式会社成立10周年的纪念作，于1973年4月在同时段播映。该剧整体风格和故事路线和第二期奥特系列" +
                "的其他作品都不太相同，剧中有许多滑稽逗趣的场面。另一方" +
                "面，剧中也提出了很多丰满了奥特系列背景故事的设定，在之后的很多" +
                "作品中都得以体现。该剧的平均收视率为17.0%，比起前作的18.6%要低，但在当时的业" +
                "界认为只要收视高于15%就是人气作品，因此本剧在当时的评价还是算高的。\n",R.drawable.tailuo3);
        mUltimanList.add(m);
        Ultiman n=new Ultiman("泰罗奥特曼在奥特兄弟中排行第六，简称“奥特六弟”。泰罗是奥特之父与奥特之母的亲生儿子，战斗力极强，可以使用奥特曼中极少数能够使用的奥特炸弹。奥特炸弹使用时，泰罗奥特曼只要只要心脏没有受损，就可以再生。而且泰罗在与怪兽战斗的时候，即使身体被贯穿，头被砍掉心脏没有受损" +
                "也能复活。由于奥特之母与赛文奥特曼的母亲玛莎奥" +
                "特曼是亲姐妹关系，所以泰罗·奥特曼的外型与同为红族的" +
                "赛文·奥特曼有许多类似之处，泰罗的头上的两个角又称“奥特天线”" +
                "与奥特之父相同，这足以证明泰罗与其他奥特兄弟不同的身份地位。做" +
                "奥特家族的贵族出身的泰罗还具有奥特心脏（具有再生能力）此外，受到难以想象的严重伤害时，彩色计时器闪烁，身体会发出蓝白色的光，直至消失。\n",R.drawable.tiga1);
        mUltimanList.add(n);
        Ultiman o=new Ultiman("《梦比优斯·奥特曼》是奥特曼系列诞生40周年纪念作，也是M78星云光之国奥特曼的回归。宇宙警备队大队长派遣新战士梦比优斯参与地球防卫，与地球上的青年人一起同怪兽和外星人作战！" +
                "该片描绘了梦比优斯奥特曼的成长故事！" +
                "计划在片中让奥特兄弟陆续客串登场！《梦比优斯奥特曼》的主演，" +
                "在片中变身为梦比优斯奥特曼的青年名叫“日比野未来”，他的扮演者是青年演员集团“D-boys”的五十岚隼士，" +
                "而梦比优斯奥特曼也被称为“最精致的奥特曼。”梦比优斯奥特曼也是为数极少的有搭档的奥特曼，搭档是希卡利奥特曼。\n",R.drawable.tiga2);
        mUltimanList.add(o);
        Ultiman p=new Ultiman("世纪末，世界各地的天才少年组成了一个名为\"炼金之星\"的组织，其成员之一的\"高山我梦\"，作为\"XIG\"的一员，靠大地给予的\"红光\"变身成\"盖亚·奥特曼\"后，投入了同CRISIS计算机所预测到的\"根源性灭亡招来体\"进行的誓死决战中；另一方面，已" +
                "脱离\"炼丹之星\"的\"藤宫博也\"坚定地认为：对于地球而言，人" +
                "类才是真正的癌细胞。他凭着\"蓝光\"的威力，变身成与\"盖亚\"相" +
                "对立的\"蓝色奥特曼--阿古茹·奥特曼\"。盖亚奥特曼的故事发生在另一个时空" +
                "中，这个时空既不同于昭和时代奥特曼的时空，也不同于迪迦奥特曼和戴拿奥特曼的时空。具有两个在如何",R.drawable.zero1);
        mUltimanList.add(p);
        Ultiman q=new Ultiman("保卫地球不受破坏招来体破坏上思想相冲突的奥特曼。故事的前一半展示了他们之间越来越紧张的关系以及两人最后的决战，而后一半则调解了两人的分歧，因此他们才能打败共同敌人。剧中的战" +
                "队也不同于以前的战队，而比以前也有许多次出场，并且" +
                "两人在故事开始经常争执。他们的思想就像他们皮肤一样不同。不像盖亚" +
                "（或是到那时的所有奥特曼），阿古茹完全是蓝色的。盖亚很坚定地去救地球和人" +
                "类，可同样出生在地球的阿古茹，在一开始只有兴趣保护这个星球，甚至不惜牺牲人类（他和盖亚的分歧就是从这里开始的）。",R.drawable.zero2);
        mUltimanList.add(q);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view= inflater.inflate(R.layout.fragment_blank,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_demo);
        UltimanAdapter viewAdapter = new UltimanAdapter(getContext(),mUltimanList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
       recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        viewAdapter.setOnItemClickListener(new UltimanAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view,Ultiman data) {
                Toast.makeText(getActivity(),"我是item",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}