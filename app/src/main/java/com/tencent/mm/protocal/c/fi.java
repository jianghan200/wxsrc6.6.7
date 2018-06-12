package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class fi
  extends com.tencent.mm.bk.a
{
  public String reE;
  public bhy rey;
  public bhy rez;
  public bhy rgk;
  public ccn rgl;
  public cge rgm;
  public int rgn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rgk != null)
      {
        paramVarArgs.fV(1, this.rgk.boi());
        this.rgk.a(paramVarArgs);
      }
      if (this.rgl != null)
      {
        paramVarArgs.fV(2, this.rgl.boi());
        this.rgl.a(paramVarArgs);
      }
      if (this.rgm != null)
      {
        paramVarArgs.fV(3, this.rgm.boi());
        this.rgm.a(paramVarArgs);
      }
      if (this.rey != null)
      {
        paramVarArgs.fV(4, this.rey.boi());
        this.rey.a(paramVarArgs);
      }
      if (this.rez != null)
      {
        paramVarArgs.fV(5, this.rez.boi());
        this.rez.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rgn);
      if (this.reE != null) {
        paramVarArgs.g(7, this.reE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rgk == null) {
        break label959;
      }
    }
    label959:
    for (int i = f.a.a.a.fS(1, this.rgk.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rgl != null) {
        paramInt = i + f.a.a.a.fS(2, this.rgl.boi());
      }
      i = paramInt;
      if (this.rgm != null) {
        i = paramInt + f.a.a.a.fS(3, this.rgm.boi());
      }
      paramInt = i;
      if (this.rey != null) {
        paramInt = i + f.a.a.a.fS(4, this.rey.boi());
      }
      i = paramInt;
      if (this.rez != null) {
        i = paramInt + f.a.a.a.fS(5, this.rez.boi());
      }
      i += f.a.a.a.fQ(6, this.rgn);
      paramInt = i;
      if (this.reE != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.reE);
      }
      return paramInt;
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
        fi localfi = (fi)paramVarArgs[1];
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
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfi.rgk = ((bhy)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccn();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfi.rgl = ((ccn)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cge();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cge)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfi.rgm = ((cge)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfi.rey = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfi.rez = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localfi.rgn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localfi.reE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */