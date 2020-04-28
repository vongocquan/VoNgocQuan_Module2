package ClearCode.KataTennisGame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        StringBuilder score = new StringBuilder();
        int tempScore=0;


        boolean b = m_score1 == m_score2;
        boolean b1 = m_score1 >= 4 || m_score2 >= 4;
        if (b)
        {
            score = getStringBuilder(m_score1);
        }
        else {
            if (b1)
            {
                score = getStringBuilder(m_score1, m_score2);
            }
            else
            {
                getStringBuilder(m_score1, m_score2, score);
            }
        }
        return score.toString();
    }

    private static void getStringBuilder(int m_score1, int m_score2, StringBuilder score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score.append("-"); tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }

    private static StringBuilder getStringBuilder(int m_score1, int m_score2) {
        StringBuilder score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score = new StringBuilder("Advantage player1");
        else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
        else if (minusResult>=2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }

    private static StringBuilder getStringBuilder(int m_score1) {
        StringBuilder score;
        switch (m_score1)
        {
            case 0:
                score = new StringBuilder("Love-All");
                break;
            case 1:
                score = new StringBuilder("Fifteen-All");
                break;
            case 2:
                score = new StringBuilder("Thirty-All");
                break;
            case 3:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;

        }
        return score;
    }
}
