package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bks
  extends bhd
{
  public String jPH;
  public String jPe;
  public String lCN;
  public String rej;
  public String skc;
  public String skd;
  
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
      if (this.jPH != null) {
        paramVarArgs.g(2, this.jPH);
      }
      if (this.skc != null) {
        paramVarArgs.g(3, this.skc);
      }
      if (this.lCN != null) {
        paramVarArgs.g(5, this.lCN);
      }
      if (this.jPe != null) {
        paramVarArgs.g(4, this.jPe);
      }
      if (this.rej != null) {
        paramVarArgs.g(6, this.rej);
      }
      if (this.skd != null) {
        paramVarArgs.g(7, this.skd);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label607;
      }
    }
    label607:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPH != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPH);
      }
      i = paramInt;
      if (this.skc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.skc);
      }
      paramInt = i;
      if (this.lCN != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.lCN);
      }
      i = paramInt;
      if (this.jPe != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jPe);
      }
      paramInt = i;
      if (this.rej != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rej);
      }
      i = paramInt;
      if (this.skd != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.skd);
      }
      return i;
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
        bks localbks = (bks)paramVarArgs[1];
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
            localbks.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbks.jPH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbks.skc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbks.lCN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbks.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbks.rej = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbks.skd = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */