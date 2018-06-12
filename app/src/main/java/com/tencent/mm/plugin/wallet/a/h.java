package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bk.a
{
  public double pdX;
  public LinkedList<q> pdZ = new LinkedList();
  public double pee;
  public double pef;
  public int peg;
  public String peh;
  public String pei;
  public b pel;
  public String pem;
  public double pen;
  public LinkedList<e> peo = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.pem != null) {
        paramVarArgs.g(1, this.pem);
      }
      paramVarArgs.c(2, this.pen);
      paramVarArgs.c(3, this.pdX);
      paramVarArgs.d(4, 8, this.peo);
      paramVarArgs.d(5, 8, this.pdZ);
      paramVarArgs.c(6, this.pee);
      paramVarArgs.c(7, this.pef);
      paramVarArgs.fT(8, this.peg);
      if (this.peh != null) {
        paramVarArgs.g(9, this.peh);
      }
      if (this.pei != null) {
        paramVarArgs.g(10, this.pei);
      }
      if (this.pel != null) {
        paramVarArgs.b(11, this.pel);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.pem == null) {
        break label798;
      }
    }
    label798:
    for (paramInt = f.a.a.b.b.a.h(1, this.pem) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 8) + (f.a.a.b.b.a.ec(3) + 8) + f.a.a.a.c(4, 8, this.peo) + f.a.a.a.c(5, 8, this.pdZ) + (f.a.a.b.b.a.ec(6) + 8) + (f.a.a.b.b.a.ec(7) + 8) + f.a.a.a.fQ(8, this.peg);
      paramInt = i;
      if (this.peh != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.peh);
      }
      i = paramInt;
      if (this.pei != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.pei);
      }
      paramInt = i;
      if (this.pel != null) {
        paramInt = i + f.a.a.a.a(11, this.pel);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.peo.clear();
        this.pdZ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        h localh = (h)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localh.pem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localh.pen = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 3: 
          localh.pdX = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localh.peo.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new q();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((q)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localh.pdZ.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          localh.pee = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 7: 
          localh.pef = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 8: 
          localh.peg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localh.peh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localh.pei = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localh.pel = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */