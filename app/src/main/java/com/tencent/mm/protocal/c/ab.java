package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ab
  extends bhp
{
  public int qZc;
  public String qZi;
  public int qZj;
  public int qZk;
  public String qZl;
  public bnr qZm;
  public bfw qZn;
  public bnr qZo;
  public bdp qZp;
  public xq qZq;
  public ep qZr;
  public String qZs;
  public String qZt;
  public int qZu;
  
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
      if (this.qZi != null) {
        paramVarArgs.g(2, this.qZi);
      }
      paramVarArgs.fT(3, this.qZj);
      paramVarArgs.fT(4, this.qZk);
      if (this.qZl != null) {
        paramVarArgs.g(5, this.qZl);
      }
      if (this.qZm != null)
      {
        paramVarArgs.fV(6, this.qZm.boi());
        this.qZm.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.qZc);
      if (this.qZn != null)
      {
        paramVarArgs.fV(8, this.qZn.boi());
        this.qZn.a(paramVarArgs);
      }
      if (this.qZo != null)
      {
        paramVarArgs.fV(9, this.qZo.boi());
        this.qZo.a(paramVarArgs);
      }
      if (this.qZp != null)
      {
        paramVarArgs.fV(10, this.qZp.boi());
        this.qZp.a(paramVarArgs);
      }
      if (this.qZq != null)
      {
        paramVarArgs.fV(11, this.qZq.boi());
        this.qZq.a(paramVarArgs);
      }
      if (this.qZr != null)
      {
        paramVarArgs.fV(12, this.qZr.boi());
        this.qZr.a(paramVarArgs);
      }
      if (this.qZs != null) {
        paramVarArgs.g(13, this.qZs);
      }
      if (this.qZt != null) {
        paramVarArgs.g(14, this.qZt);
      }
      paramVarArgs.fT(15, this.qZu);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1579;
      }
    }
    label1579:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.qZi != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.qZi);
      }
      i = i + f.a.a.a.fQ(3, this.qZj) + f.a.a.a.fQ(4, this.qZk);
      paramInt = i;
      if (this.qZl != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.qZl);
      }
      i = paramInt;
      if (this.qZm != null) {
        i = paramInt + f.a.a.a.fS(6, this.qZm.boi());
      }
      i += f.a.a.a.fQ(7, this.qZc);
      paramInt = i;
      if (this.qZn != null) {
        paramInt = i + f.a.a.a.fS(8, this.qZn.boi());
      }
      i = paramInt;
      if (this.qZo != null) {
        i = paramInt + f.a.a.a.fS(9, this.qZo.boi());
      }
      paramInt = i;
      if (this.qZp != null) {
        paramInt = i + f.a.a.a.fS(10, this.qZp.boi());
      }
      i = paramInt;
      if (this.qZq != null) {
        i = paramInt + f.a.a.a.fS(11, this.qZq.boi());
      }
      paramInt = i;
      if (this.qZr != null) {
        paramInt = i + f.a.a.a.fS(12, this.qZr.boi());
      }
      i = paramInt;
      if (this.qZs != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.qZs);
      }
      paramInt = i;
      if (this.qZt != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.qZt);
      }
      return paramInt + f.a.a.a.fQ(15, this.qZu);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        ab localab = (ab)paramVarArgs[1];
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
            localab.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localab.qZi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localab.qZj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localab.qZk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localab.qZl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZm = ((bnr)localObject1);
            paramInt += 1;
          }
        case 7: 
          localab.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bfw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bfw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZn = ((bfw)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZo = ((bnr)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bdp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZp = ((bdp)localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZq = ((xq)localObject1);
            paramInt += 1;
          }
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ep();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ep)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localab.qZr = ((ep)localObject1);
            paramInt += 1;
          }
        case 13: 
          localab.qZs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localab.qZt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localab.qZu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */