package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class afh
  extends bhd
{
  public int jRb;
  public int otY;
  public int rJn;
  public LinkedList<atu> rJo = new LinkedList();
  public int rJp;
  public LinkedList<arr> rJq = new LinkedList();
  public String rwt;
  
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
      paramVarArgs.fT(2, this.jRb);
      if (this.rwt != null) {
        paramVarArgs.g(3, this.rwt);
      }
      paramVarArgs.fT(4, this.rJn);
      paramVarArgs.d(5, 8, this.rJo);
      paramVarArgs.fT(6, this.rJp);
      paramVarArgs.d(7, 8, this.rJq);
      paramVarArgs.fT(8, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label746;
      }
    }
    label746:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jRb);
      paramInt = i;
      if (this.rwt != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rwt);
      }
      return paramInt + f.a.a.a.fQ(4, this.rJn) + f.a.a.a.c(5, 8, this.rJo) + f.a.a.a.fQ(6, this.rJp) + f.a.a.a.c(7, 8, this.rJq) + f.a.a.a.fQ(8, this.otY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJo.clear();
        this.rJq.clear();
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
        afh localafh = (afh)paramVarArgs[1];
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
            localafh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafh.jRb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localafh.rwt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localafh.rJn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localafh.rJo.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          localafh.rJp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new arr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((arr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localafh.rJq.add(localObject1);
            paramInt += 1;
          }
        }
        localafh.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/afh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */