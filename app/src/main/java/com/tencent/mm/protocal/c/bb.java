package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bb
  extends bhd
{
  public String bssid;
  public String egF;
  public int egJ;
  public String rbn;
  public long rbo;
  public bm rbp;
  public int rbq;
  public int rbr;
  public String rbs;
  public int rbt;
  public int scene;
  public int source;
  public String ssid;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.egF != null) {
        paramVarArgs.g(2, this.egF);
      }
      paramVarArgs.fT(3, this.egJ);
      if (this.rbn != null) {
        paramVarArgs.g(4, this.rbn);
      }
      paramVarArgs.fT(5, this.scene);
      if (this.ssid != null) {
        paramVarArgs.g(6, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.g(7, this.bssid);
      }
      paramVarArgs.T(8, this.rbo);
      if (this.rbp != null)
      {
        paramVarArgs.fV(9, this.rbp.boi());
        this.rbp.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.rbq);
      paramVarArgs.fT(11, this.rbr);
      paramVarArgs.fT(12, this.source);
      if (this.rbs != null) {
        paramVarArgs.g(13, this.rbs);
      }
      paramVarArgs.fT(14, this.rbt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label978;
      }
    }
    label978:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.egF != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.egF);
      }
      i += f.a.a.a.fQ(3, this.egJ);
      paramInt = i;
      if (this.rbn != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rbn);
      }
      i = paramInt + f.a.a.a.fQ(5, this.scene);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ssid);
      }
      i = paramInt;
      if (this.bssid != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.bssid);
      }
      i += f.a.a.a.S(8, this.rbo);
      paramInt = i;
      if (this.rbp != null) {
        paramInt = i + f.a.a.a.fS(9, this.rbp.boi());
      }
      i = paramInt + f.a.a.a.fQ(10, this.rbq) + f.a.a.a.fQ(11, this.rbr) + f.a.a.a.fQ(12, this.source);
      paramInt = i;
      if (this.rbs != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rbs);
      }
      return paramInt + f.a.a.a.fQ(14, this.rbt);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bb localbb = (bb)paramVarArgs[1];
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
            localbb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbb.egF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbb.egJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbb.rbn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbb.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbb.ssid = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbb.bssid = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbb.rbo = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbb.rbp = ((bm)localObject1);
            paramInt += 1;
          }
        case 10: 
          localbb.rbq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbb.rbr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbb.source = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbb.rbs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbb.rbt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */