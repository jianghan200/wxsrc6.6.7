package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class fg
  extends com.tencent.mm.bk.a
{
  public String knE;
  public String lMV;
  public String mug;
  public int muh;
  public int mui;
  public String muj;
  public String muk;
  public String mul;
  public LinkedList<ua> rgf = new LinkedList();
  public String rgg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lMV != null) {
        paramVarArgs.g(1, this.lMV);
      }
      if (this.knE != null) {
        paramVarArgs.g(2, this.knE);
      }
      if (this.mug != null) {
        paramVarArgs.g(3, this.mug);
      }
      paramVarArgs.fT(4, this.muh);
      paramVarArgs.fT(5, this.mui);
      paramVarArgs.d(6, 8, this.rgf);
      if (this.muj != null) {
        paramVarArgs.g(7, this.muj);
      }
      if (this.muk != null) {
        paramVarArgs.g(8, this.muk);
      }
      if (this.mul != null) {
        paramVarArgs.g(9, this.mul);
      }
      if (this.rgg != null) {
        paramVarArgs.g(10, this.rgg);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lMV == null) {
        break label728;
      }
    }
    label728:
    for (int i = f.a.a.b.b.a.h(1, this.lMV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.knE != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.knE);
      }
      i = paramInt;
      if (this.mug != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mug);
      }
      i = i + f.a.a.a.fQ(4, this.muh) + f.a.a.a.fQ(5, this.mui) + f.a.a.a.c(6, 8, this.rgf);
      paramInt = i;
      if (this.muj != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.muj);
      }
      i = paramInt;
      if (this.muk != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.muk);
      }
      paramInt = i;
      if (this.mul != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.mul);
      }
      i = paramInt;
      if (this.rgg != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rgg);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rgf.clear();
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
        fg localfg = (fg)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localfg.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localfg.knE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localfg.mug = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localfg.muh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localfg.mui = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ua();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ua)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localfg.rgf.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localfg.muj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localfg.muk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localfg.mul = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localfg.rgg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */