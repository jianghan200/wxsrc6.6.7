package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class h
  extends bhd
{
  public String qYd;
  public LinkedList<j> qYh = new LinkedList();
  public aw qYi;
  public long qYj;
  public long qYl;
  public int scene;
  public String title;
  
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
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      paramVarArgs.T(3, this.qYl);
      paramVarArgs.d(5, 8, this.qYh);
      paramVarArgs.fT(7, this.scene);
      if (this.qYd != null) {
        paramVarArgs.g(8, this.qYd);
      }
      if (this.qYi != null)
      {
        paramVarArgs.fV(9, this.qYi.boi());
        this.qYi.a(paramVarArgs);
      }
      paramVarArgs.T(10, this.qYj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label790;
      }
    }
    label790:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.title);
      }
      i = i + f.a.a.a.S(3, this.qYl) + f.a.a.a.c(5, 8, this.qYh) + f.a.a.a.fQ(7, this.scene);
      paramInt = i;
      if (this.qYd != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.qYd);
      }
      i = paramInt;
      if (this.qYi != null) {
        i = paramInt + f.a.a.a.fS(9, this.qYi.boi());
      }
      return i + f.a.a.a.S(10, this.qYj);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qYh.clear();
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
        h localh = (h)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 4: 
        case 6: 
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
            localh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localh.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localh.qYl = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new j();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((j)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localh.qYh.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localh.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localh.qYd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localh.qYi = ((aw)localObject1);
            paramInt += 1;
          }
        }
        localh.qYj = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */