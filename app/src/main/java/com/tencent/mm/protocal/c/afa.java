package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afa
  extends bhp
{
  public String eJJ;
  public bhy rIW;
  public int rJb;
  public LinkedList<bhz> rJc = new LinkedList();
  public int rJd;
  public LinkedList<aqq> rJe = new LinkedList();
  public String rJf;
  public int rJg;
  public int rJh;
  public aqr rJi;
  public String rJj;
  public int rlm;
  public String rlo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rIW == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rIW != null)
      {
        paramVarArgs.fV(2, this.rIW.boi());
        this.rIW.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rJb);
      paramVarArgs.d(4, 8, this.rJc);
      paramVarArgs.fT(5, this.rJd);
      paramVarArgs.d(6, 8, this.rJe);
      paramVarArgs.fT(7, this.rlm);
      if (this.rJf != null) {
        paramVarArgs.g(8, this.rJf);
      }
      if (this.rlo != null) {
        paramVarArgs.g(9, this.rlo);
      }
      paramVarArgs.fT(10, this.rJg);
      if (this.eJJ != null) {
        paramVarArgs.g(11, this.eJJ);
      }
      paramVarArgs.fT(12, this.rJh);
      if (this.rJi != null)
      {
        paramVarArgs.fV(13, this.rJi.boi());
        this.rJi.a(paramVarArgs);
      }
      if (this.rJj != null) {
        paramVarArgs.g(14, this.rJj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1324;
      }
    }
    label1324:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rIW != null) {
        i = paramInt + f.a.a.a.fS(2, this.rIW.boi());
      }
      i = i + f.a.a.a.fQ(3, this.rJb) + f.a.a.a.c(4, 8, this.rJc) + f.a.a.a.fQ(5, this.rJd) + f.a.a.a.c(6, 8, this.rJe) + f.a.a.a.fQ(7, this.rlm);
      paramInt = i;
      if (this.rJf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rJf);
      }
      i = paramInt;
      if (this.rlo != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rlo);
      }
      i += f.a.a.a.fQ(10, this.rJg);
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.eJJ);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rJh);
      paramInt = i;
      if (this.rJi != null) {
        paramInt = i + f.a.a.a.fS(13, this.rJi.boi());
      }
      i = paramInt;
      if (this.rJj != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.rJj);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJc.clear();
        this.rJe.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rIW != null) {
          break;
        }
        throw new b("Not all required fields were included: Buff");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        afa localafa = (afa)paramVarArgs[1];
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
            localafa.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafa.rIW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localafa.rJb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafa.rJc.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localafa.rJd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aqq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aqq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafa.rJe.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localafa.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localafa.rJf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localafa.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localafa.rJg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localafa.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localafa.rJh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aqr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aqr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafa.rJi = ((aqr)localObject1);
            paramInt += 1;
          }
        }
        localafa.rJj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */