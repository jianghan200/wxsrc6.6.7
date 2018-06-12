package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bwc
  extends bhd
{
  public String hbL;
  public LinkedList<atu> rTA = new LinkedList();
  public int rfe;
  public String rhu;
  public int sss;
  public int sst;
  public LinkedList<arr> ssu = new LinkedList();
  
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
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      paramVarArgs.fT(3, this.rfe);
      if (this.rhu != null) {
        paramVarArgs.g(4, this.rhu);
      }
      paramVarArgs.fT(5, this.sss);
      paramVarArgs.d(6, 8, this.rTA);
      paramVarArgs.fT(7, this.sst);
      paramVarArgs.d(8, 8, this.ssu);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label762;
      }
    }
    label762:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hbL);
      }
      i += f.a.a.a.fQ(3, this.rfe);
      paramInt = i;
      if (this.rhu != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhu);
      }
      return paramInt + f.a.a.a.fQ(5, this.sss) + f.a.a.a.c(6, 8, this.rTA) + f.a.a.a.fQ(7, this.sst) + f.a.a.a.c(8, 8, this.ssu);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rTA.clear();
        this.ssu.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bwc localbwc = (bwc)paramVarArgs[1];
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
            localbwc.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwc.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbwc.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbwc.rhu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbwc.sss = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwc.rTA.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localbwc.sst = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new arr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((arr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbwc.ssu.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bwc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */