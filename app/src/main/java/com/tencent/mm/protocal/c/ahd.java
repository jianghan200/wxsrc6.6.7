package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ahd
  extends bhp
{
  public int hUm;
  public String hUn;
  public boolean pjc;
  public boolean rKA;
  public boolean rKB;
  public String rKC;
  public String rKD;
  public String rKE;
  public String rKF;
  public boolean rKG;
  public LinkedList<String> rKH = new LinkedList();
  public String rKr;
  public String rKs;
  public String rKt;
  public String rKu;
  public String rKv;
  public boolean rKw;
  public String rKx;
  public long rKy;
  public boolean rKz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hUm);
      if (this.hUn != null) {
        paramVarArgs.g(3, this.hUn);
      }
      if (this.rKr != null) {
        paramVarArgs.g(4, this.rKr);
      }
      if (this.rKs != null) {
        paramVarArgs.g(5, this.rKs);
      }
      if (this.rKt != null) {
        paramVarArgs.g(6, this.rKt);
      }
      if (this.rKu != null) {
        paramVarArgs.g(7, this.rKu);
      }
      if (this.rKv != null) {
        paramVarArgs.g(8, this.rKv);
      }
      paramVarArgs.av(9, this.rKw);
      if (this.rKx != null) {
        paramVarArgs.g(10, this.rKx);
      }
      paramVarArgs.T(11, this.rKy);
      paramVarArgs.av(12, this.rKz);
      paramVarArgs.av(13, this.rKA);
      paramVarArgs.av(14, this.rKB);
      if (this.rKC != null) {
        paramVarArgs.g(15, this.rKC);
      }
      if (this.rKD != null) {
        paramVarArgs.g(16, this.rKD);
      }
      if (this.rKE != null) {
        paramVarArgs.g(17, this.rKE);
      }
      if (this.rKF != null) {
        paramVarArgs.g(18, this.rKF);
      }
      paramVarArgs.av(19, this.rKG);
      paramVarArgs.d(20, 1, this.rKH);
      paramVarArgs.av(21, this.pjc);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1267;
      }
    }
    label1267:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.rKr != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rKr);
      }
      paramInt = i;
      if (this.rKs != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rKs);
      }
      i = paramInt;
      if (this.rKt != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rKt);
      }
      paramInt = i;
      if (this.rKu != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rKu);
      }
      i = paramInt;
      if (this.rKv != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rKv);
      }
      i += f.a.a.b.b.a.ec(9) + 1;
      paramInt = i;
      if (this.rKx != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rKx);
      }
      i = paramInt + f.a.a.a.S(11, this.rKy) + (f.a.a.b.b.a.ec(12) + 1) + (f.a.a.b.b.a.ec(13) + 1) + (f.a.a.b.b.a.ec(14) + 1);
      paramInt = i;
      if (this.rKC != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rKC);
      }
      i = paramInt;
      if (this.rKD != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.rKD);
      }
      paramInt = i;
      if (this.rKE != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rKE);
      }
      i = paramInt;
      if (this.rKF != null) {
        i = paramInt + f.a.a.b.b.a.h(18, this.rKF);
      }
      return i + (f.a.a.b.b.a.ec(19) + 1) + f.a.a.a.c(20, 1, this.rKH) + (f.a.a.b.b.a.ec(21) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rKH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ahd localahd = (ahd)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localahd.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localahd.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localahd.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localahd.rKr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localahd.rKs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localahd.rKt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localahd.rKu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localahd.rKv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localahd.rKw = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 10: 
          localahd.rKx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localahd.rKy = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 12: 
          localahd.rKz = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 13: 
          localahd.rKA = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 14: 
          localahd.rKB = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 15: 
          localahd.rKC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localahd.rKD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localahd.rKE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localahd.rKF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localahd.rKG = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 20: 
          localahd.rKH.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        }
        localahd.pjc = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ahd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */