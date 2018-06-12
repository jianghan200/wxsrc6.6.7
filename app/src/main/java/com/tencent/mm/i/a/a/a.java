package com.tencent.mm.i.a.a;

import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bk.a
{
  public int bUd;
  public int bWA;
  public LinkedList<b> dav = new LinkedList();
  public int daw;
  public String dax;
  public int daz;
  public int status;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.dav);
      paramVarArgs.fT(2, this.bWA);
      paramVarArgs.fT(3, this.type);
      paramVarArgs.fT(4, this.status);
      paramVarArgs.fT(5, this.daw);
      if (this.dax != null) {
        paramVarArgs.g(6, this.dax);
      }
      paramVarArgs.fT(7, this.bUd);
      paramVarArgs.fT(8, this.daz);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.c(1, 8, this.dav) + 0 + f.a.a.a.fQ(2, this.bWA) + f.a.a.a.fQ(3, this.type) + f.a.a.a.fQ(4, this.status) + f.a.a.a.fQ(5, this.daw);
      paramInt = i;
      if (this.dax != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.dax);
      }
      return paramInt + f.a.a.a.fQ(7, this.bUd) + f.a.a.a.fQ(8, this.daz);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.dav.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
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
          localObject1 = new b();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((b)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locala.dav.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        locala.bWA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locala.type = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        locala.status = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        locala.daw = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        locala.dax = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        locala.bUd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      locala.daz = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/i/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */