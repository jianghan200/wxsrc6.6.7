package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ba
  extends com.tencent.mm.bk.a
{
  public String jPT;
  public String jPc;
  public String jSv;
  public String rbf;
  public String rbg;
  public String rbh;
  public String rbi;
  public String rbj;
  public String rbk;
  public cib rbl;
  public String rbm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc != null) {
        paramVarArgs.g(1, this.jPc);
      }
      if (this.rbf != null) {
        paramVarArgs.g(2, this.rbf);
      }
      if (this.rbg != null) {
        paramVarArgs.g(3, this.rbg);
      }
      if (this.jPT != null) {
        paramVarArgs.g(4, this.jPT);
      }
      if (this.jSv != null) {
        paramVarArgs.g(5, this.jSv);
      }
      if (this.rbh != null) {
        paramVarArgs.g(6, this.rbh);
      }
      if (this.rbi != null) {
        paramVarArgs.g(7, this.rbi);
      }
      if (this.rbj != null) {
        paramVarArgs.g(8, this.rbj);
      }
      if (this.rbk != null) {
        paramVarArgs.g(9, this.rbk);
      }
      if (this.rbl != null)
      {
        paramVarArgs.fV(10, this.rbl.boi());
        this.rbl.a(paramVarArgs);
      }
      if (this.rbm != null) {
        paramVarArgs.g(11, this.rbm);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPc == null) {
        break label835;
      }
    }
    label835:
    for (int i = f.a.a.b.b.a.h(1, this.jPc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rbf != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rbf);
      }
      i = paramInt;
      if (this.rbg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rbg);
      }
      paramInt = i;
      if (this.jPT != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPT);
      }
      i = paramInt;
      if (this.jSv != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jSv);
      }
      paramInt = i;
      if (this.rbh != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rbh);
      }
      i = paramInt;
      if (this.rbi != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rbi);
      }
      paramInt = i;
      if (this.rbj != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rbj);
      }
      i = paramInt;
      if (this.rbk != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rbk);
      }
      paramInt = i;
      if (this.rbl != null) {
        paramInt = i + f.a.a.a.fS(10, this.rbl.boi());
      }
      i = paramInt;
      if (this.rbm != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rbm);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ba localba = (ba)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localba.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localba.rbf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localba.rbg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localba.jPT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localba.jSv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localba.rbh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localba.rbi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localba.rbj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localba.rbk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cib();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cib)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localba.rbl = ((cib)localObject1);
            paramInt += 1;
          }
        }
        localba.rbm = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */