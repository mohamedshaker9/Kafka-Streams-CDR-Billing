import com.cdr.BilledRatedCDRCurrentQuantityBalance;
import com.cdr.CurrentQuantityBalance;
import com.cdr.RatedCDR;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.nio.ByteBuffer;
import java.util.Date;

public class BuildJoinClasses {

    public static BilledRatedCDRCurrentQuantityBalance getRatedBilledJoined(
            RatedCDR ratedCDR, CurrentQuantityBalance currentQuantityBalance) {

        return BilledRatedCDRCurrentQuantityBalance.newBuilder()
                .setCdrID(ratedCDR.getCdrID())
                .setMSISDNB(ratedCDR.getMSISDNB())
                .setCallTime(ratedCDR.getCallTime())
                .setDurationInSeconds(ratedCDR.getDurationInSeconds())
                .setRate(ratedCDR.getRate())
                .setServiceName(ratedCDR.getServiceName())
                .setExpirationDate(currentQuantityBalance.getExpirationDate())
                .setCurrentBalance(calculateCurrentBalance(ratedCDR.getRate(), currentQuantityBalance.getCurrentBalance()))
                .setIsBilled(1)
                .setLastUpdate(new Date().toInstant())
                .build();

    }

    private static CharSequence calculateCurrentBalance(ByteBuffer rate, CharSequence currentBalance) {
        BigDecimal rateBD = new BigDecimal(new BigInteger(rate.array()), 2);
        BigDecimal currentBalanceBD = new BigDecimal(currentBalance.toString());
        BigDecimal newCurrentBalance = rateBD.add(currentBalanceBD, new MathContext(10)).setScale(3);
        System.out.println(" -> New Current Balance= " + newCurrentBalance.toString());
        return newCurrentBalance.toString();

    }
}
