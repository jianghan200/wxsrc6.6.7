package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class oe
  extends bhd
{
  public String bHD;
  public String jQb;
  public int otY;
  public String rsp;
  public String rsq;
  public String rsr;
  public String rss;
  public String rst;
  public String rsu;
  public String rsv;
  
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
      if (this.rsp != null) {
        paramVarArgs.g(2, this.rsp);
      }
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.rsq != null) {
        paramVarArgs.g(4, this.rsq);
      }
      if (this.rsr != null) {
        paramVarArgs.g(5, this.rsr);
      }
      if (this.rss != null) {
        paramVarArgs.g(6, this.rss);
      }
      if (this.rst != null) {
        paramVarArgs.g(7, this.rst);
      }
      if (this.rsu != null) {
        paramVarArgs.g(8, this.rsu);
      }
      if (this.jQb != null) {
        paramVarArgs.g(9, this.jQb);
      }
      paramVarArgs.fT(10, this.otY);
      if (this.rsv != null) {
        paramVarArgs.g(11, this.rsv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label819;
      }
    }
    label819:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rsp != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rsp);
      }
      i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHD);
      }
      paramInt = i;
      if (this.rsq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rsq);
      }
      i = paramInt;
      if (this.rsr != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsr);
      }
      paramInt = i;
      if (this.rss != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rss);
      }
      i = paramInt;
      if (this.rst != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rst);
      }
      paramInt = i;
      if (this.rsu != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rsu);
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.jQb);
      }
      i += f.a.a.a.fQ(10, this.otY);
      paramInt = i;
      if (this.rsv != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rsv);
      }
      return paramInt;
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
        oe localoe = (oe)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localoe.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localoe.rsp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localoe.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localoe.rsq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localoe.rsr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localoe.rss = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localoe.rst = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localoe.rsu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localoe.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localoe.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localoe.rsv = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/oe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */