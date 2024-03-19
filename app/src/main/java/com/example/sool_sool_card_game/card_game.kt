package com.example.sool_sool_card_game

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class card_game : AppCompatActivity() {
    private var textview: TextView? = null
    private val list_Normal = ArrayList<String>().apply {
        add("혈액형 O형 제외하고 다 마셔!")
        add("혈액형 AB형 제외하고 다 마셔!")
        add("술병 돌려서 지목당한 사람\n 마셔!")
        add("술병 돌려서 지목당한 사람\n 제외 모두 마셔!")
        add("코로나 2회 이상 걸려 본 사람 마셔!")
        add("친해졌으면 하는 두 사람 지목!\n(해당 차례 조원이 지목)\n러브샷!")
        add("반지 2개 이상 낀 사람 마셔!")
        add("오늘 최고 기온 확인하고\n 짝수이면 다 마셔!")
        add("공휴일에 태어난 사람 마셔!")
        add("서울 경기 사람 마셔!")
        add("너 기준 바로 왼쪽 사람 마셔!")
        add("너 기준 바로 오른쪽 사람 마셔!")
        add("너 기준 맞주 앉은 사람 마셔!")
        add("한 사람 지목 후 \n같이 이구 동성 게임 시작!\n하나라도 안 맞으면 둘 다 마셔!\n삼성 vs 애플, 밥 vs 빵,\n 연상 vs 연하")
        add("형제 중 가장 막내인 사람 마셔!")
        add("흰 양말 신은 사람 마셔!")
        add("눈 가장 가까이 점 있는 사람 마셔!")
        add("지금 휴대폰 들고 있는 사람 마셔!")
        add("너 마셔!")
        add("폭탄주 제조하고 다음 차례 마셔!")
        add("창가 가까이 앉은 사람 마셔!")
        add("오늘 최저 기온 확인하고\n 홀수이면 다 마셔!")
        add("가장 최근 해외여행 \n다녀온 사람 마셔!")
        add("손가락 털이 가장 긴 사람 마셔!")
        add("너 춤추며 마셔!")
        add("신체 비율 8등신 이상 다 마셔!")
        add("생일 끝자리 짝수인 사람 마셔!")
        add("카톡 안 읽은 메세지 \n가장 많은 사람 마셔!")
        add("휴대폰 모아놓고 \n가장 먼저 알림 울린 사람 마셔!")
        add("다리 찢기 해서 90도\n 못 넘는 사람 마셔!")
        add("아무도 주지 말고 너만 마셔!")
        add("이름에 정,진,숙,윤 \n들어간 사람 마셔!")
        add("맞은 편 사람과 팔씨름해서\n 진 사람 마셔!")
        add("폰에 패턴 암호 \n걸려 있는 사람 마셔!")
        add("골반 위치 가장 높은\n 사람 마셔!")
        add("스마트 워치 찬 사람 마셔!")
        add("휴대폰 액정 깨진 사람 마셔!")
        add("의상 올 블랙인 사람 마셔!")
        add("솔로 된 지 1년 안 된 사람 마셔!")
        add("기상 알람 최소 3개\n 이상인 사람 마셔!")
        add("휴대폰 배터리 50%\n 이하인 사람 마셔!")
        add("구레나룻이 가장 긴 사람 마셔!")
        add("휴대폰 숫자 암호 \n걸려 있는 사람 마셔!")
        add("MBTI가 E인 사람 마셔!")
        add("MBTI가 T인 사람 마셔!")
        add("새끼 손가락이 가장 짧은\n 사람 마셔!")
        add("딱 걸렸어! 너 마셔~")
        add("흑기사 신청하고 \n거부 당하면 2잔 마셔~")
        add("MBTI가 J인 사람 마셔!")
        add("웃을 때 눈 사라지는 사람 마셔!")
    }
    private val list_Vote = ArrayList<String>().apply {
        add("계획표 없는 여행 \n극혐할 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("애인 몰래 바람 피우면 \n바로 들통날 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("동네 방네 오만 참견 \n다 할 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("사회 경제 뉴스보다 연예 뉴스 \n더 챙겨볼 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("인플루언서에게 DM 보내봤을 것\n같은 사람 마셔!\n 하나 둘 셋 하면 지목")
        add("평소에 눈치가 없을 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("평소에 눈치가 빠를 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("소개팅 어플 유료 결제 해봤을 것 \n같은 사람!\n하나 둘 셋 하면 지목")
        add("남몰래 신조어 \n공부할 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("10년이 지나도 얼굴 \n그대로일 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("아직도 전 애인 번호 가지고 \n있을 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("큰일 보고 양말로 해결해 본 적 \n있을 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("웃음소리가 가장 \n독특한 사람 마셔!\n하나 둘 셋 하면 지목")
        add("싫은 사람 앞에서도 생글생글 \n잘 웃을 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("첫 키스 가장 늦게 \n했을 것 같은 사람!\n하나 둘 셋 하면 지목")
        add("호러 영화 볼 때\n 눈 하나 깜빡 \n안 할 것 같은 사람!\n하나 둘 셋 하면 지목")
    }
    private val list_Free = ArrayList<String>().apply {
        add("PASS")
        add("PASS")
    }
    private val list_Game = ArrayList<String>().apply {
        add("국내 활동 중인 \n외국인 연예인 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("국내 감자 과자 이름 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n아메리카노,콜라,팥빙수")
        add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n바퀴벌레, 개미, 나방")
        add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n트로트, 힙합, 클래식")
        add("조원 전원 북한 말투 \n한 번씩 쓰기 시작!\n웃거나 실패한 사람 마셔!")
        add("5인조 남자 아이돌 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("국내 치킨 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("커피 종류 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("국내 피자 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("치즈 종류 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("4인조 여자 아이돌 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("나라별 인사말 하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
        add("국내 맥주 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
    }
    private val list_Item = ArrayList<String>().apply {
        add("1회 공격권\n 한 사람 지목!")
        add("1회 공격권\n 한 사람 지목!")
        add("1회 공격권\n 한 사람 지목!")
        add("1회 면제권\n 필요한 순간 사용!")
        add("1회 면제권\n 필요한 순간 사용!")
        add("1회 면제권\n 필요한 순간 사용!")
    }
    private var remain_card = list_Normal.size + list_Vote.size + list_Free.size + list_Game.size + list_Item.size

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_game)

        // id가 rotate_card인 버튼을 눌렀을 때 activity_card_view.xml의 TextView인 id가 card_view의 back_ground를 card_front로 회전하며 변경
        val rotateButton = findViewById<Button>(R.id.rotate_card)
        val cardView = findViewById<TextView>(R.id.card_view)
        val remainCard = findViewById<TextView>(R.id.remain_card)

        rotateButton.setOnClickListener {
            // 랜덤으로 1에서 4까지 숫자를 뽑아서 1이면 list_Group의 랜덤한 원소를, 2면 list_All의 랜덤한 원소를, 3이면 list_Free의 랜덤한 원소를, 4면 list_Item의 랜덤한 원소를 cardView의 text로 설정 후 해당 원소 삭제
            // text에 "(남은 카드 수 : remain_card개)"를 추가
            // 색도 각각 다르게 설정
            // cardView의 back_ground를 card_front로 설정
            // remain_card가 0이면 게임 종료
            // 해당 list의 원소가 없다면 다른 list에서 랜덤한 원소를 뽑아서 cardView의 text로 설정 후 해당 원소 삭제
            //처음 버튼을 클릭했을 때만 background를 card_front로 설정
            cardView.setBackgroundResource(R.drawable.card_front)

            if (remain_card > 0) {
                var random = (1..5).random()

                while((random == 1 && list_Normal.isEmpty()) || (random == 2 && list_Vote.isEmpty()) || (random == 3 && list_Free.isEmpty()) || (random == 4 && list_Game.isEmpty())||(random == 5 && list_Item.isEmpty())){
                    random = (1..5).random()
                }

                when (random) {
                    1 -> {
                        val randomIndex = (0 until list_Normal.size).random()
                        rotate_card(list_Normal[randomIndex])
                        cardView.setTextColor(Color.parseColor("#0066CC"))
                        remainCard.text = "남은 카드 수 : " + --remain_card
                        list_Normal.removeAt(randomIndex)
                    }
                    2 -> {
                        val randomIndex = (0 until list_Vote.size).random()
                        rotate_card(list_Vote[randomIndex])
                        cardView.setTextColor(Color.parseColor("#800080"))
                        remainCard.text = "남은 카드 수 : " + --remain_card
                        list_Vote.removeAt(randomIndex)
                    }
                    3 -> {
                        val randomIndex = (0 until list_Free.size).random()
                        rotate_card(list_Free[randomIndex])
                        cardView.setTextColor(Color.parseColor("#FFA500"))
                        remainCard.text = "남은 카드 수 : " + --remain_card
                        list_Free.removeAt(randomIndex)
                    }
                    4 -> {
                        val randomIndex = (0 until list_Game.size).random()
                        rotate_card(list_Game[randomIndex])
                        cardView.setTextColor(Color.parseColor("#008000"))
                        remainCard.text = "남은 카드 수 : " + --remain_card
                        list_Game.removeAt(randomIndex)
                    }
                    5 -> {
                        val randomIndex = (0 until list_Item.size).random()
                        rotate_card(list_Item[randomIndex])
                        cardView.setTextColor(Color.parseColor("#FF0000"))
                        remainCard.text = "남은 카드 수 : " + --remain_card
                        list_Item.removeAt(randomIndex)
                    }
                  }
            }else {
                rotate_card("게임 종료!\n게임을 초기화해주세요!")
                cardView.setTextColor(Color.parseColor("#0000FF"))
            }
        }
        val resetButton = findViewById<Button>(R.id.reset_card)
        resetButton.setOnClickListener {
            rotate_card("게임 초기화!\n카드를 뽑아주세요!")
            cardView.setTextColor(Color.parseColor("#0000FF"))
            list_Normal.clear()
            list_Normal.add("혈액형 O형 제외하고 다 마셔!")
            list_Normal.add("혈액형 AB형 제외하고 다 마셔!")
            list_Normal.add("술병 돌려서 지목당한 사람\n 마셔!")
            list_Normal.add("술병 돌려서 지목당한 사람\n 제외 모두 마셔!")
            list_Normal.add("코로나 2회 이상 걸려 본 사람 마셔!")
            list_Normal.add("친해졌으면 하는 두 사람 지목!\n(해당 차례 조원이 지목)\n러브샷!")
            list_Normal.add("반지 2개 이상 낀 사람 마셔!")
            list_Normal.add("오늘 최고 기온 확인하고\n 짝수이면 다 마셔!")
            list_Normal.add("공휴일에 태어난 사람 마셔!")
            list_Normal.add("서울 경기 사람 마셔!")
            list_Normal.add("너 기준 바로 왼쪽 사람 마셔!")
            list_Normal.add("너 기준 바로 오른쪽 사람 마셔!")
            list_Normal.add("너 기준 맞주 앉은 사람 마셔!")
            list_Normal.add("한 사람 지목 후 \n같이 이구 동성 게임 시작!\n하나라도 안 맞으면 둘 다 마셔!\n삼성 vs 애플, 밥 vs 빵,\n 연상 vs 연하")
            list_Normal.add("형제 중 가장 막내인 사람 마셔!")
            list_Normal.add("흰 양말 신은 사람 마셔!")
            list_Normal.add("눈 가장 가까이 점 있는 사람 마셔!")
            list_Normal.add("지금 휴대폰 들고 있는 사람 마셔!")
            list_Normal.add("너 마셔!")
            list_Normal.add("폭탄주 제조하고 다음 차례 마셔!")
            list_Normal.add("창가 가까이 앉은 사람 마셔!")
            list_Normal.add("오늘 최저 기온 확인하고\n 홀수이면 다 마셔!")
            list_Normal.add("가장 최근 해외여행 \n다녀온 사람 마셔!")
            list_Normal.add("손가락 털이 가장 긴 사람 마셔!")
            list_Normal.add("너 춤추며 마셔!")
            list_Normal.add("신체 비율 8등신 이상 다 마셔!")
            list_Normal.add("생일 끝자리 짝수인 사람 마셔!")
            list_Normal.add("카톡 안 읽은 메세지 \n가장 많은 사람 마셔!")
            list_Normal.add("휴대폰 모아놓고 \n가장 먼저 알림 울린 사람 마셔!")
            list_Normal.add("다리 찢기 해서 90도\n 못 넘는 사람 마셔!")
            list_Normal.add("아무도 주지 말고 너만 마셔!")
            list_Normal.add("이름에 정,진,숙,윤 \n들어간 사람 마셔!")
            list_Normal.add("맞은 편 사람과 팔씨름해서\n 진 사람 마셔!")
            list_Normal.add("폰에 패턴 암호 \n걸려 있는 사람 마셔!")
            list_Normal.add("골반 위치 가장 높은\n 사람 마셔!")
            list_Normal.add("스마트 워치 찬 사람 마셔!")
            list_Normal.add("휴대폰 액정 깨진 사람 마셔!")
            list_Normal.add("의상 올 블랙인 사람 마셔!")
            list_Normal.add("솔로 된 지 1년 안 된 사람 마셔!")
            list_Normal.add("기상 알람 최소 3개\n 이상인 사람 마셔!")
            list_Normal.add("휴대폰 배터리 50%\n 이하인 사람 마셔!")
            list_Normal.add("구레나룻이 가장 긴 사람 마셔!")
            list_Normal.add("휴대폰 숫자 암호 \n걸려 있는 사람 마셔!")
            list_Normal.add("MBTI가 E인 사람 마셔!")
            list_Normal.add("MBTI가 T인 사람 마셔!")
            list_Normal.add("새끼 손가락이 가장 짧은\n 사람 마셔!")
            list_Normal.add("딱 걸렸어! 너 마셔~")
            list_Normal.add("흑기사 신청하고 \n거부 당하면 2잔 마셔~")
            list_Normal.add("MBTI가 J인 사람 마셔!")
            list_Normal.add("웃을 때 눈 사라지는 사람 마셔!")
            list_Free.clear()
            list_Free.add("PASS")
            list_Free.add("PASS")
            list_Vote.clear()
            list_Vote.add("계획표 없는 여행 \n극혐할 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("애인 몰래 바람 피우면 \n바로 들통날 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("동네 방네 오만 참견 \n다 할 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("사회 경제 뉴스보다 연예 뉴스 \n더 챙겨볼 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("인플루언서에게 DM 보내봤을 것 \n같은 사람 마셔!\n 하나 둘 셋 하면 지목")
            list_Vote.add("평소에 눈치가 없을 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("평소에 눈치가 빠를 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("소개팅 어플 유료 결제 해봤을 것 \n같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("남몰래 신조어 \n공부할 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("10년이 지나도 얼굴 \n그대로일 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("아직도 전 애인 번호 가지고 \n있을 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("큰일 보고 양말로 해결해 본 적 \n있을 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("웃음소리가 가장 \n독특한 사람 마셔!\n하나 둘 셋 하면 지목")
            list_Vote.add("싫은 사람 앞에서도 생글생글 \n잘 웃을 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("첫 키스 가장 늦게 \n했을 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Vote.add("호러 영화 볼 때 눈 하나 깜빡 \n안 할 것 같은 사람!\n하나 둘 셋 하면 지목")
            list_Game.clear()
            list_Game.add("국내 활동 중인 \n외국인 연예인 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("국내 감자 과자 이름 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n아메리카노,콜라,팥빙수")
            list_Game.add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n바퀴벌레, 개미, 나방")
            list_Game.add("아래 단어 중 하나 몸으로 \n설명하고 아무도 못 맞추면 마셔!\n트로트, 힙합, 클래식")
            list_Game.add("조원 전원 북한 말투 \n한 번씩 쓰기 시작!\n웃거나 실패한 사람 마셔!")
            list_Game.add("5인조 남자 아이돌 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("국내 치킨 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("커피 종류 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("국내 피자 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("치즈 종류 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("4인조 여자 아이돌 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("나라별 인사말 하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Game.add("국내 맥주 브랜드 말하기 시작!\n 틀리거나 늦게 말한 사람 마셔!")
            list_Item.clear()
            list_Item.add("1회 공격권\n 한 사람 지목!")
            list_Item.add("1회 공격권\n 한 사람 지목!")
            list_Item.add("1회 공격권\n 한 사람 지목!")
            list_Item.add("1회 면제권\n 필요한 순간 사용!")
            list_Item.add("1회 면제권\n 필요한 순간 사용!")
            list_Item.add("1회 면제권\n 필요한 순간 사용!")

            remain_card = list_Normal.size + list_Vote.size + list_Free.size + list_Game.size + list_Item.size
            remainCard.text = "남은 카드 수 : " + remain_card
        }
    }

    private fun rotate_card(st: String){
        val cardView = findViewById<TextView>(R.id.card_view)

        cardView.setBackgroundResource(R.drawable.card_front)

        val scale = resources.displayMetrics.density
        //val distance = cardView.cameraDistance * (scale + (scale / 3))
        val distance = 8000f
        cardView.cameraDistance = distance

        cardView.animate()
            .withLayer()
            .rotationY(90f)
            .setDuration(150)
            .withEndAction {
                cardView.text = st
                cardView.rotationY = -90f
                cardView.animate()
                    .withLayer()
                    .rotationY(0f)
                    .setDuration(150)
                    .start()
            }
    }
}