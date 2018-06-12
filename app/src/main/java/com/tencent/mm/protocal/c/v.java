package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class v
  extends bhp
{
  public int hUm = 268513600;
  public String hUn = "请求不成功，请稍候再试";
  public String qYB;
  public long qYC;
  public int qYD;
  public long qYE;
  public int qYF;
  public int qYG;
  public int qYH;
  public int qYI;
  public long qYJ;
  public long qYK;
  public long qYL;
  public int qYM;
  public String qYN;
  public int qYO;
  public long qYP;
  public String qYc;
  public LinkedList<t> qYh = new LinkedList();
  public int qYn;
  public String qYx;
  public int state;
  public String title;
  public int type;
  
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
      if (this.qYc != null) {
        paramVarArgs.g(4, this.qYc);
      }
      if (this.title != null) {
        paramVarArgs.g(5, this.title);
      }
      paramVarArgs.fT(6, this.type);
      if (this.qYB != null) {
        paramVarArgs.g(7, this.qYB);
      }
      paramVarArgs.T(8, this.qYC);
      paramVarArgs.fT(9, this.qYD);
      paramVarArgs.T(10, this.qYE);
      paramVarArgs.fT(11, this.qYF);
      paramVarArgs.fT(12, this.state);
      paramVarArgs.fT(13, this.qYG);
      paramVarArgs.fT(14, this.qYH);
      paramVarArgs.fT(15, this.qYn);
      paramVarArgs.fT(16, this.qYI);
      paramVarArgs.T(17, this.qYJ);
      paramVarArgs.T(18, this.qYK);
      paramVarArgs.T(19, this.qYL);
      paramVarArgs.fT(20, this.qYM);
      if (this.qYx != null) {
        paramVarArgs.g(21, this.qYx);
      }
      paramVarArgs.d(22, 8, this.qYh);
      if (this.qYN != null) {
        paramVarArgs.g(23, this.qYN);
      }
      paramVarArgs.fT(24, this.qYO);
      paramVarArgs.T(25, this.qYP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1443;
      }
    }
    label1443:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.qYc != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.qYc);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.title);
      }
      i = paramInt + f.a.a.a.fQ(6, this.type);
      paramInt = i;
      if (this.qYB != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.qYB);
      }
      i = paramInt + f.a.a.a.S(8, this.qYC) + f.a.a.a.fQ(9, this.qYD) + f.a.a.a.S(10, this.qYE) + f.a.a.a.fQ(11, this.qYF) + f.a.a.a.fQ(12, this.state) + f.a.a.a.fQ(13, this.qYG) + f.a.a.a.fQ(14, this.qYH) + f.a.a.a.fQ(15, this.qYn) + f.a.a.a.fQ(16, this.qYI) + f.a.a.a.S(17, this.qYJ) + f.a.a.a.S(18, this.qYK) + f.a.a.a.S(19, this.qYL) + f.a.a.a.fQ(20, this.qYM);
      paramInt = i;
      if (this.qYx != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.qYx);
      }
      i = paramInt + f.a.a.a.c(22, 8, this.qYh);
      paramInt = i;
      if (this.qYN != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.qYN);
      }
      return paramInt + f.a.a.a.fQ(24, this.qYO) + f.a.a.a.S(25, this.qYP);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qYh.clear();
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
        v localv = (v)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localv.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localv.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localv.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localv.qYc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localv.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localv.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localv.qYB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localv.qYC = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          localv.qYD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localv.qYE = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 11: 
          localv.qYF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localv.state = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localv.qYG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localv.qYH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localv.qYn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localv.qYI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localv.qYJ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 18: 
          localv.qYK = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 19: 
          localv.qYL = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 20: 
          localv.qYM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localv.qYx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new t();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localv.qYh.add(localObject1);
            paramInt += 1;
          }
        case 23: 
          localv.qYN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          localv.qYO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localv.qYP = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */