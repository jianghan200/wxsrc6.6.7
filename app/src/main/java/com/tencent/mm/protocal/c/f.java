package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class f
  extends bhd
{
  public String qYd;
  public int qYf;
  public long qYg;
  public LinkedList<String> qYh = new LinkedList();
  public aw qYi;
  public long qYj;
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
      paramVarArgs.fT(2, this.qYf);
      paramVarArgs.T(3, this.qYg);
      if (this.title != null) {
        paramVarArgs.g(4, this.title);
      }
      paramVarArgs.d(5, 1, this.qYh);
      paramVarArgs.fT(6, this.scene);
      if (this.qYd != null) {
        paramVarArgs.g(7, this.qYd);
      }
      if (this.qYi != null)
      {
        paramVarArgs.fV(8, this.qYi.boi());
        this.qYi.a(paramVarArgs);
      }
      paramVarArgs.T(9, this.qYj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label739;
      }
    }
    label739:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qYf) + f.a.a.a.S(3, this.qYg);
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.title);
      }
      i = paramInt + f.a.a.a.c(5, 1, this.qYh) + f.a.a.a.fQ(6, this.scene);
      paramInt = i;
      if (this.qYd != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.qYd);
      }
      i = paramInt;
      if (this.qYi != null) {
        i = paramInt + f.a.a.a.fS(8, this.qYi.boi());
      }
      return i + f.a.a.a.S(9, this.qYj);
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
        f localf = (f)paramVarArgs[1];
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
            localf.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localf.qYf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localf.qYg = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localf.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localf.qYh.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 6: 
          localf.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localf.qYd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localf.qYi = ((aw)localObject1);
            paramInt += 1;
          }
        }
        localf.qYj = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */