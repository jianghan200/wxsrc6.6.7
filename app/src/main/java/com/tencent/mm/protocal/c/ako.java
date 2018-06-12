package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ako
  extends bhp
{
  public String bSc;
  public int gTo;
  public String rNg;
  public String rNi;
  public int rNj;
  public LinkedList<avr> rNk = new LinkedList();
  public int rNl;
  public String rNm;
  public String rNn;
  public int rNo;
  public String rNp;
  public String rNq;
  public String rNr;
  public int rNs;
  public int rNt;
  public avr rNu;
  public cgh rrI;
  
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
      if (this.rrI != null)
      {
        paramVarArgs.fV(2, this.rrI.boi());
        this.rrI.a(paramVarArgs);
      }
      if (this.rNi != null) {
        paramVarArgs.g(3, this.rNi);
      }
      paramVarArgs.fT(4, this.rNj);
      paramVarArgs.fT(5, this.gTo);
      if (this.rNg != null) {
        paramVarArgs.g(6, this.rNg);
      }
      paramVarArgs.d(7, 8, this.rNk);
      paramVarArgs.fT(8, this.rNl);
      if (this.rNm != null) {
        paramVarArgs.g(9, this.rNm);
      }
      if (this.rNn != null) {
        paramVarArgs.g(10, this.rNn);
      }
      paramVarArgs.fT(11, this.rNo);
      if (this.bSc != null) {
        paramVarArgs.g(12, this.bSc);
      }
      if (this.rNp != null) {
        paramVarArgs.g(13, this.rNp);
      }
      if (this.rNq != null) {
        paramVarArgs.g(14, this.rNq);
      }
      if (this.rNr != null) {
        paramVarArgs.g(15, this.rNr);
      }
      paramVarArgs.fT(16, this.rNs);
      paramVarArgs.fT(17, this.rNt);
      if (this.rNu != null)
      {
        paramVarArgs.fV(18, this.rNu.boi());
        this.rNu.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1426;
      }
    }
    label1426:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rrI != null) {
        paramInt = i + f.a.a.a.fS(2, this.rrI.boi());
      }
      i = paramInt;
      if (this.rNi != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rNi);
      }
      i = i + f.a.a.a.fQ(4, this.rNj) + f.a.a.a.fQ(5, this.gTo);
      paramInt = i;
      if (this.rNg != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rNg);
      }
      i = paramInt + f.a.a.a.c(7, 8, this.rNk) + f.a.a.a.fQ(8, this.rNl);
      paramInt = i;
      if (this.rNm != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rNm);
      }
      i = paramInt;
      if (this.rNn != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rNn);
      }
      i += f.a.a.a.fQ(11, this.rNo);
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.bSc);
      }
      i = paramInt;
      if (this.rNp != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rNp);
      }
      paramInt = i;
      if (this.rNq != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rNq);
      }
      i = paramInt;
      if (this.rNr != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rNr);
      }
      i = i + f.a.a.a.fQ(16, this.rNs) + f.a.a.a.fQ(17, this.rNt);
      paramInt = i;
      if (this.rNu != null) {
        paramInt = i + f.a.a.a.fS(18, this.rNu.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rNk.clear();
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
        ako localako = (ako)paramVarArgs[1];
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
            localako.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cgh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localako.rrI = ((cgh)localObject1);
            paramInt += 1;
          }
        case 3: 
          localako.rNi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localako.rNj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localako.gTo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localako.rNg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new avr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localako.rNk.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localako.rNl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localako.rNm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localako.rNn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localako.rNo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localako.bSc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localako.rNp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localako.rNq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localako.rNr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localako.rNs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localako.rNt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new avr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((avr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localako.rNu = ((avr)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ako.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */