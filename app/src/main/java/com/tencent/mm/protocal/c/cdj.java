package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cdj
  extends bhd
{
  public String bPS;
  public String bWm;
  public int id;
  public LinkedList<Integer> syU = new LinkedList();
  
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
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      paramVarArgs.fT(3, this.id);
      paramVarArgs.d(4, 2, this.syU);
      if (this.bWm != null) {
        paramVarArgs.g(5, this.bWm);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label476;
      }
    }
    label476:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = i + f.a.a.a.fQ(3, this.id) + f.a.a.a.c(4, 2, this.syU);
      paramInt = i;
      if (this.bWm != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.bWm);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.syU.clear();
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
        cdj localcdj = (cdj)paramVarArgs[1];
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
            localcdj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcdj.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcdj.id = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localcdj.syU.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        }
        localcdj.bWm = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */