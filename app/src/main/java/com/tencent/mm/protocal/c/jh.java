package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class jh
  extends bhd
{
  public int bVU;
  public int mwQ;
  public String mxM;
  public String myf;
  public String myg;
  public String myi;
  public int myk;
  public String myl;
  public String mym;
  public String nickname;
  public String onE;
  public String onF;
  public xb rcG;
  public String rcH;
  public int rcI;
  public String rkC;
  public String rkD;
  public String rkE;
  public int rkF;
  public boolean rkG;
  public boolean rkH;
  public String rkI;
  public int rkJ;
  public String rkw;
  public int scene;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rkC == null) {
        throw new b("Not all required fields were included: qrcode_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.myl != null) {
        paramVarArgs.g(2, this.myl);
      }
      if (this.rkC != null) {
        paramVarArgs.g(3, this.rkC);
      }
      paramVarArgs.fT(4, this.scene);
      if (this.rkD != null) {
        paramVarArgs.g(5, this.rkD);
      }
      if (this.myf != null) {
        paramVarArgs.g(6, this.myf);
      }
      paramVarArgs.fT(7, this.rcI);
      paramVarArgs.fT(8, this.bVU);
      if (this.mym != null) {
        paramVarArgs.g(9, this.mym);
      }
      if (this.myg != null) {
        paramVarArgs.g(10, this.myg);
      }
      if (this.rkE != null) {
        paramVarArgs.g(11, this.rkE);
      }
      paramVarArgs.fT(12, this.rkF);
      paramVarArgs.fT(13, this.myk);
      if (this.rcH != null) {
        paramVarArgs.g(14, this.rcH);
      }
      if (this.rcG != null)
      {
        paramVarArgs.fV(15, this.rcG.boi());
        this.rcG.a(paramVarArgs);
      }
      if (this.rkw != null) {
        paramVarArgs.g(16, this.rkw);
      }
      paramVarArgs.fT(17, this.mwQ);
      paramVarArgs.av(18, this.rkG);
      paramVarArgs.av(19, this.rkH);
      if (this.onE != null) {
        paramVarArgs.g(20, this.onE);
      }
      if (this.onF != null) {
        paramVarArgs.g(21, this.onF);
      }
      if (this.rkI != null) {
        paramVarArgs.g(22, this.rkI);
      }
      if (this.myi != null) {
        paramVarArgs.g(23, this.myi);
      }
      if (this.nickname != null) {
        paramVarArgs.g(24, this.nickname);
      }
      if (this.mxM != null) {
        paramVarArgs.g(25, this.mxM);
      }
      paramVarArgs.fT(26, this.rkJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1652;
      }
    }
    label1652:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.myl != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.myl);
      }
      i = paramInt;
      if (this.rkC != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rkC);
      }
      i += f.a.a.a.fQ(4, this.scene);
      paramInt = i;
      if (this.rkD != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rkD);
      }
      i = paramInt;
      if (this.myf != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.myf);
      }
      i = i + f.a.a.a.fQ(7, this.rcI) + f.a.a.a.fQ(8, this.bVU);
      paramInt = i;
      if (this.mym != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.mym);
      }
      i = paramInt;
      if (this.myg != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.myg);
      }
      paramInt = i;
      if (this.rkE != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rkE);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rkF) + f.a.a.a.fQ(13, this.myk);
      paramInt = i;
      if (this.rcH != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rcH);
      }
      i = paramInt;
      if (this.rcG != null) {
        i = paramInt + f.a.a.a.fS(15, this.rcG.boi());
      }
      paramInt = i;
      if (this.rkw != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rkw);
      }
      i = paramInt + f.a.a.a.fQ(17, this.mwQ) + (f.a.a.b.b.a.ec(18) + 1) + (f.a.a.b.b.a.ec(19) + 1);
      paramInt = i;
      if (this.onE != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.onE);
      }
      i = paramInt;
      if (this.onF != null) {
        i = paramInt + f.a.a.b.b.a.h(21, this.onF);
      }
      paramInt = i;
      if (this.rkI != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.rkI);
      }
      i = paramInt;
      if (this.myi != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.myi);
      }
      paramInt = i;
      if (this.nickname != null) {
        paramInt = i + f.a.a.b.b.a.h(24, this.nickname);
      }
      i = paramInt;
      if (this.mxM != null) {
        i = paramInt + f.a.a.b.b.a.h(25, this.mxM);
      }
      return i + f.a.a.a.fQ(26, this.rkJ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rkC != null) {
          break;
        }
        throw new b("Not all required fields were included: qrcode_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        jh localjh = (jh)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localjh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localjh.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localjh.rkC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localjh.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localjh.rkD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localjh.myf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localjh.rcI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localjh.bVU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localjh.mym = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localjh.myg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localjh.rkE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localjh.rkF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localjh.myk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localjh.rcH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xb();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localjh.rcG = ((xb)localObject1);
            paramInt += 1;
          }
        case 16: 
          localjh.rkw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localjh.mwQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localjh.rkG = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 19: 
          localjh.rkH = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 20: 
          localjh.onE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localjh.onF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localjh.rkI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          localjh.myi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          localjh.nickname = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 25: 
          localjh.mxM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localjh.rkJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */