class StockSpanner {
    private static class Pair {
        int price, daysBeforeLessOrEqual;

        public Pair(int price, int daysBeforeLessOrEqual) {
            this.price = price;
            this.daysBeforeLessOrEqual = daysBeforeLessOrEqual;
        }
    }

    private final Stack<Pair> stk;

    public StockSpanner() {
        stk = new Stack<>();
    }

    public int next(int price) {
        int ans = 1;

        while (!stk.isEmpty() && stk.peek().price <= price) {
            ans += stk.pop().daysBeforeLessOrEqual;
        }

        stk.push(new Pair(price, ans));

        return ans;
    }
}

/*
 

الفكرة البسيطة اللي ممكن تخطر للواحد انه يمسك العنصر ويمشي على اللي قبله لحد ما القى عنصر اكبر منه وبقول وبكون اعد وبرجع العداد

وهاض الحكي الTime Complexity الهO(n^2)

بس ممكن اعمل اشي احسن
لو الاحظ وانا ماشي بدور على العنصر الاكبر, في عنصر رح يكون وراه عناصر اقل منه او تساويه ورح امر عليها كل مرة
طيب ليش ما اخزن هاي المعلومة لبعدين عشان تفيدني؟
الفكرة انه هاي القيمة بخزنها وبخزن عدد اللي وراها اقل من او بساويها(بالطريقة اللي بتحبها احنا عملنا class وحركات) بحيث وانا ماشي لما اصطدم بهاي القيمة تكون نائبة عن كل القيم وراها وهكذا...

وين نخزن هاي القيم؟
ستاك
ليش؟
انا معني باللي وراي مباشرة (اللي بوجهي) بالتالي الستاك رح يكون خيار مناسب لحل هيك مسألة

طبعاً رح تكون الTime Complexity لهاض الحكي O(n) !!
لاحظ الفرق Data Structure بسيط وشوية تحليل وتفكير زيادة شو فرقوا معي!!

حاولوا تتبعوا الامثلة والحل ورح تفهموا اكثر
وبالتوفيق
 */